/*
Licensed to the Apache Software Foundation (ASF) under one or more
contributor license agreements.  See the NOTICE file distributed with
this work for additional information regarding copyright ownership.
The ASF licenses this file to You under the Apache License, Version 2.0
(the "License"); you may not use this file except in compliance with
the License.  You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

// Code generated by lister-gen. DO NOT EDIT.

package v1alpha1

import (
	v1alpha1 "github.com/apache/camel-k/pkg/apis/camel/v1alpha1"
	"k8s.io/apimachinery/pkg/api/errors"
	"k8s.io/apimachinery/pkg/labels"
	"k8s.io/client-go/tools/cache"
)

// KameletLister helps list Kamelets.
// All objects returned here must be treated as read-only.
type KameletLister interface {
	// List lists all Kamelets in the indexer.
	// Objects returned here must be treated as read-only.
	List(selector labels.Selector) (ret []*v1alpha1.Kamelet, err error)
	// Kamelets returns an object that can list and get Kamelets.
	Kamelets(namespace string) KameletNamespaceLister
	KameletListerExpansion
}

// kameletLister implements the KameletLister interface.
type kameletLister struct {
	indexer cache.Indexer
}

// NewKameletLister returns a new KameletLister.
func NewKameletLister(indexer cache.Indexer) KameletLister {
	return &kameletLister{indexer: indexer}
}

// List lists all Kamelets in the indexer.
func (s *kameletLister) List(selector labels.Selector) (ret []*v1alpha1.Kamelet, err error) {
	err = cache.ListAll(s.indexer, selector, func(m interface{}) {
		ret = append(ret, m.(*v1alpha1.Kamelet))
	})
	return ret, err
}

// Kamelets returns an object that can list and get Kamelets.
func (s *kameletLister) Kamelets(namespace string) KameletNamespaceLister {
	return kameletNamespaceLister{indexer: s.indexer, namespace: namespace}
}

// KameletNamespaceLister helps list and get Kamelets.
// All objects returned here must be treated as read-only.
type KameletNamespaceLister interface {
	// List lists all Kamelets in the indexer for a given namespace.
	// Objects returned here must be treated as read-only.
	List(selector labels.Selector) (ret []*v1alpha1.Kamelet, err error)
	// Get retrieves the Kamelet from the indexer for a given namespace and name.
	// Objects returned here must be treated as read-only.
	Get(name string) (*v1alpha1.Kamelet, error)
	KameletNamespaceListerExpansion
}

// kameletNamespaceLister implements the KameletNamespaceLister
// interface.
type kameletNamespaceLister struct {
	indexer   cache.Indexer
	namespace string
}

// List lists all Kamelets in the indexer for a given namespace.
func (s kameletNamespaceLister) List(selector labels.Selector) (ret []*v1alpha1.Kamelet, err error) {
	err = cache.ListAllByNamespace(s.indexer, s.namespace, selector, func(m interface{}) {
		ret = append(ret, m.(*v1alpha1.Kamelet))
	})
	return ret, err
}

// Get retrieves the Kamelet from the indexer for a given namespace and name.
func (s kameletNamespaceLister) Get(name string) (*v1alpha1.Kamelet, error) {
	obj, exists, err := s.indexer.GetByKey(s.namespace + "/" + name)
	if err != nil {
		return nil, err
	}
	if !exists {
		return nil, errors.NewNotFound(v1alpha1.Resource("kamelet"), name)
	}
	return obj.(*v1alpha1.Kamelet), nil
}
