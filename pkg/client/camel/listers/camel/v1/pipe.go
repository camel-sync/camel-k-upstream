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

package v1

import (
	v1 "github.com/apache/camel-k/v2/pkg/apis/camel/v1"
	"k8s.io/apimachinery/pkg/api/errors"
	"k8s.io/apimachinery/pkg/labels"
	"k8s.io/client-go/tools/cache"
)

// PipeLister helps list Pipes.
// All objects returned here must be treated as read-only.
type PipeLister interface {
	// List lists all Pipes in the indexer.
	// Objects returned here must be treated as read-only.
	List(selector labels.Selector) (ret []*v1.Pipe, err error)
	// Pipes returns an object that can list and get Pipes.
	Pipes(namespace string) PipeNamespaceLister
	PipeListerExpansion
}

// pipeLister implements the PipeLister interface.
type pipeLister struct {
	indexer cache.Indexer
}

// NewPipeLister returns a new PipeLister.
func NewPipeLister(indexer cache.Indexer) PipeLister {
	return &pipeLister{indexer: indexer}
}

// List lists all Pipes in the indexer.
func (s *pipeLister) List(selector labels.Selector) (ret []*v1.Pipe, err error) {
	err = cache.ListAll(s.indexer, selector, func(m interface{}) {
		ret = append(ret, m.(*v1.Pipe))
	})
	return ret, err
}

// Pipes returns an object that can list and get Pipes.
func (s *pipeLister) Pipes(namespace string) PipeNamespaceLister {
	return pipeNamespaceLister{indexer: s.indexer, namespace: namespace}
}

// PipeNamespaceLister helps list and get Pipes.
// All objects returned here must be treated as read-only.
type PipeNamespaceLister interface {
	// List lists all Pipes in the indexer for a given namespace.
	// Objects returned here must be treated as read-only.
	List(selector labels.Selector) (ret []*v1.Pipe, err error)
	// Get retrieves the Pipe from the indexer for a given namespace and name.
	// Objects returned here must be treated as read-only.
	Get(name string) (*v1.Pipe, error)
	PipeNamespaceListerExpansion
}

// pipeNamespaceLister implements the PipeNamespaceLister
// interface.
type pipeNamespaceLister struct {
	indexer   cache.Indexer
	namespace string
}

// List lists all Pipes in the indexer for a given namespace.
func (s pipeNamespaceLister) List(selector labels.Selector) (ret []*v1.Pipe, err error) {
	err = cache.ListAllByNamespace(s.indexer, s.namespace, selector, func(m interface{}) {
		ret = append(ret, m.(*v1.Pipe))
	})
	return ret, err
}

// Get retrieves the Pipe from the indexer for a given namespace and name.
func (s pipeNamespaceLister) Get(name string) (*v1.Pipe, error) {
	obj, exists, err := s.indexer.GetByKey(s.namespace + "/" + name)
	if err != nil {
		return nil, err
	}
	if !exists {
		return nil, errors.NewNotFound(v1.Resource("pipe"), name)
	}
	return obj.(*v1.Pipe), nil
}
