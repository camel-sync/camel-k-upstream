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

// Code generated by client-gen. DO NOT EDIT.

package fake

import (
	"context"
	json "encoding/json"
	"fmt"

	v1 "github.com/apache/camel-k/v2/pkg/apis/camel/v1"
	camelv1 "github.com/apache/camel-k/v2/pkg/client/camel/applyconfiguration/camel/v1"
	metav1 "k8s.io/apimachinery/pkg/apis/meta/v1"
	labels "k8s.io/apimachinery/pkg/labels"
	types "k8s.io/apimachinery/pkg/types"
	watch "k8s.io/apimachinery/pkg/watch"
	testing "k8s.io/client-go/testing"
)

// FakeIntegrationPlatforms implements IntegrationPlatformInterface
type FakeIntegrationPlatforms struct {
	Fake *FakeCamelV1
	ns   string
}

var integrationplatformsResource = v1.SchemeGroupVersion.WithResource("integrationplatforms")

var integrationplatformsKind = v1.SchemeGroupVersion.WithKind("IntegrationPlatform")

// Get takes name of the integrationPlatform, and returns the corresponding integrationPlatform object, and an error if there is any.
func (c *FakeIntegrationPlatforms) Get(ctx context.Context, name string, options metav1.GetOptions) (result *v1.IntegrationPlatform, err error) {
	obj, err := c.Fake.
		Invokes(testing.NewGetAction(integrationplatformsResource, c.ns, name), &v1.IntegrationPlatform{})

	if obj == nil {
		return nil, err
	}
	return obj.(*v1.IntegrationPlatform), err
}

// List takes label and field selectors, and returns the list of IntegrationPlatforms that match those selectors.
func (c *FakeIntegrationPlatforms) List(ctx context.Context, opts metav1.ListOptions) (result *v1.IntegrationPlatformList, err error) {
	obj, err := c.Fake.
		Invokes(testing.NewListAction(integrationplatformsResource, integrationplatformsKind, c.ns, opts), &v1.IntegrationPlatformList{})

	if obj == nil {
		return nil, err
	}

	label, _, _ := testing.ExtractFromListOptions(opts)
	if label == nil {
		label = labels.Everything()
	}
	list := &v1.IntegrationPlatformList{ListMeta: obj.(*v1.IntegrationPlatformList).ListMeta}
	for _, item := range obj.(*v1.IntegrationPlatformList).Items {
		if label.Matches(labels.Set(item.Labels)) {
			list.Items = append(list.Items, item)
		}
	}
	return list, err
}

// Watch returns a watch.Interface that watches the requested integrationPlatforms.
func (c *FakeIntegrationPlatforms) Watch(ctx context.Context, opts metav1.ListOptions) (watch.Interface, error) {
	return c.Fake.
		InvokesWatch(testing.NewWatchAction(integrationplatformsResource, c.ns, opts))

}

// Create takes the representation of a integrationPlatform and creates it.  Returns the server's representation of the integrationPlatform, and an error, if there is any.
func (c *FakeIntegrationPlatforms) Create(ctx context.Context, integrationPlatform *v1.IntegrationPlatform, opts metav1.CreateOptions) (result *v1.IntegrationPlatform, err error) {
	obj, err := c.Fake.
		Invokes(testing.NewCreateAction(integrationplatformsResource, c.ns, integrationPlatform), &v1.IntegrationPlatform{})

	if obj == nil {
		return nil, err
	}
	return obj.(*v1.IntegrationPlatform), err
}

// Update takes the representation of a integrationPlatform and updates it. Returns the server's representation of the integrationPlatform, and an error, if there is any.
func (c *FakeIntegrationPlatforms) Update(ctx context.Context, integrationPlatform *v1.IntegrationPlatform, opts metav1.UpdateOptions) (result *v1.IntegrationPlatform, err error) {
	obj, err := c.Fake.
		Invokes(testing.NewUpdateAction(integrationplatformsResource, c.ns, integrationPlatform), &v1.IntegrationPlatform{})

	if obj == nil {
		return nil, err
	}
	return obj.(*v1.IntegrationPlatform), err
}

// UpdateStatus was generated because the type contains a Status member.
// Add a +genclient:noStatus comment above the type to avoid generating UpdateStatus().
func (c *FakeIntegrationPlatforms) UpdateStatus(ctx context.Context, integrationPlatform *v1.IntegrationPlatform, opts metav1.UpdateOptions) (*v1.IntegrationPlatform, error) {
	obj, err := c.Fake.
		Invokes(testing.NewUpdateSubresourceAction(integrationplatformsResource, "status", c.ns, integrationPlatform), &v1.IntegrationPlatform{})

	if obj == nil {
		return nil, err
	}
	return obj.(*v1.IntegrationPlatform), err
}

// Delete takes name of the integrationPlatform and deletes it. Returns an error if one occurs.
func (c *FakeIntegrationPlatforms) Delete(ctx context.Context, name string, opts metav1.DeleteOptions) error {
	_, err := c.Fake.
		Invokes(testing.NewDeleteActionWithOptions(integrationplatformsResource, c.ns, name, opts), &v1.IntegrationPlatform{})

	return err
}

// DeleteCollection deletes a collection of objects.
func (c *FakeIntegrationPlatforms) DeleteCollection(ctx context.Context, opts metav1.DeleteOptions, listOpts metav1.ListOptions) error {
	action := testing.NewDeleteCollectionAction(integrationplatformsResource, c.ns, listOpts)

	_, err := c.Fake.Invokes(action, &v1.IntegrationPlatformList{})
	return err
}

// Patch applies the patch and returns the patched integrationPlatform.
func (c *FakeIntegrationPlatforms) Patch(ctx context.Context, name string, pt types.PatchType, data []byte, opts metav1.PatchOptions, subresources ...string) (result *v1.IntegrationPlatform, err error) {
	obj, err := c.Fake.
		Invokes(testing.NewPatchSubresourceAction(integrationplatformsResource, c.ns, name, pt, data, subresources...), &v1.IntegrationPlatform{})

	if obj == nil {
		return nil, err
	}
	return obj.(*v1.IntegrationPlatform), err
}

// Apply takes the given apply declarative configuration, applies it and returns the applied integrationPlatform.
func (c *FakeIntegrationPlatforms) Apply(ctx context.Context, integrationPlatform *camelv1.IntegrationPlatformApplyConfiguration, opts metav1.ApplyOptions) (result *v1.IntegrationPlatform, err error) {
	if integrationPlatform == nil {
		return nil, fmt.Errorf("integrationPlatform provided to Apply must not be nil")
	}
	data, err := json.Marshal(integrationPlatform)
	if err != nil {
		return nil, err
	}
	name := integrationPlatform.Name
	if name == nil {
		return nil, fmt.Errorf("integrationPlatform.Name must be provided to Apply")
	}
	obj, err := c.Fake.
		Invokes(testing.NewPatchSubresourceAction(integrationplatformsResource, c.ns, *name, types.ApplyPatchType, data), &v1.IntegrationPlatform{})

	if obj == nil {
		return nil, err
	}
	return obj.(*v1.IntegrationPlatform), err
}

// ApplyStatus was generated because the type contains a Status member.
// Add a +genclient:noStatus comment above the type to avoid generating ApplyStatus().
func (c *FakeIntegrationPlatforms) ApplyStatus(ctx context.Context, integrationPlatform *camelv1.IntegrationPlatformApplyConfiguration, opts metav1.ApplyOptions) (result *v1.IntegrationPlatform, err error) {
	if integrationPlatform == nil {
		return nil, fmt.Errorf("integrationPlatform provided to Apply must not be nil")
	}
	data, err := json.Marshal(integrationPlatform)
	if err != nil {
		return nil, err
	}
	name := integrationPlatform.Name
	if name == nil {
		return nil, fmt.Errorf("integrationPlatform.Name must be provided to Apply")
	}
	obj, err := c.Fake.
		Invokes(testing.NewPatchSubresourceAction(integrationplatformsResource, c.ns, *name, types.ApplyPatchType, data, "status"), &v1.IntegrationPlatform{})

	if obj == nil {
		return nil, err
	}
	return obj.(*v1.IntegrationPlatform), err
}
