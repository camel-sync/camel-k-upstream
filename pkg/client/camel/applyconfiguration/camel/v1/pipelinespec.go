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

// Code generated by applyconfiguration-gen. DO NOT EDIT.

package v1

import (
	metav1 "k8s.io/apimachinery/pkg/apis/meta/v1"
)

// PipelineSpecApplyConfiguration represents an declarative configuration of the PipelineSpec type for use
// with apply.
type PipelineSpecApplyConfiguration struct {
	Tasks   []TaskApplyConfiguration `json:"tasks,omitempty"`
	Timeout *metav1.Duration         `json:"timeout,omitempty"`
}

// PipelineSpecApplyConfiguration constructs an declarative configuration of the PipelineSpec type for use with
// apply.
func PipelineSpec() *PipelineSpecApplyConfiguration {
	return &PipelineSpecApplyConfiguration{}
}

// WithTasks adds the given value to the Tasks field in the declarative configuration
// and returns the receiver, so that objects can be build by chaining "With" function invocations.
// If called multiple times, values provided by each call will be appended to the Tasks field.
func (b *PipelineSpecApplyConfiguration) WithTasks(values ...*TaskApplyConfiguration) *PipelineSpecApplyConfiguration {
	for i := range values {
		if values[i] == nil {
			panic("nil value passed to WithTasks")
		}
		b.Tasks = append(b.Tasks, *values[i])
	}
	return b
}

// WithTimeout sets the Timeout field in the declarative configuration to the given value
// and returns the receiver, so that objects can be built by chaining "With" function invocations.
// If called multiple times, the Timeout field is set to the value of the last call.
func (b *PipelineSpecApplyConfiguration) WithTimeout(value metav1.Duration) *PipelineSpecApplyConfiguration {
	b.Timeout = &value
	return b
}
