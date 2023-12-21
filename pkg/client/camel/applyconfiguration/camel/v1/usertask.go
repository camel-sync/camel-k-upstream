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

// UserTaskApplyConfiguration represents an declarative configuration of the UserTask type for use
// with apply.
type UserTaskApplyConfiguration struct {
	BaseTaskApplyConfiguration `json:",inline"`
	ContainerImage             *string  `json:"image,omitempty"`
	ContainerCommand           *string  `json:"command,omitempty"`
	ContainerCommands          []string `json:"commands,omitempty"`
}

// UserTaskApplyConfiguration constructs an declarative configuration of the UserTask type for use with
// apply.
func UserTask() *UserTaskApplyConfiguration {
	return &UserTaskApplyConfiguration{}
}

// WithName sets the Name field in the declarative configuration to the given value
// and returns the receiver, so that objects can be built by chaining "With" function invocations.
// If called multiple times, the Name field is set to the value of the last call.
func (b *UserTaskApplyConfiguration) WithName(value string) *UserTaskApplyConfiguration {
	b.Name = &value
	return b
}

// WithConfiguration sets the Configuration field in the declarative configuration to the given value
// and returns the receiver, so that objects can be built by chaining "With" function invocations.
// If called multiple times, the Configuration field is set to the value of the last call.
func (b *UserTaskApplyConfiguration) WithConfiguration(value *BuildConfigurationApplyConfiguration) *UserTaskApplyConfiguration {
	b.Configuration = value
	return b
}

// WithContainerImage sets the ContainerImage field in the declarative configuration to the given value
// and returns the receiver, so that objects can be built by chaining "With" function invocations.
// If called multiple times, the ContainerImage field is set to the value of the last call.
func (b *UserTaskApplyConfiguration) WithContainerImage(value string) *UserTaskApplyConfiguration {
	b.ContainerImage = &value
	return b
}

// WithContainerCommand sets the ContainerCommand field in the declarative configuration to the given value
// and returns the receiver, so that objects can be built by chaining "With" function invocations.
// If called multiple times, the ContainerCommand field is set to the value of the last call.
func (b *UserTaskApplyConfiguration) WithContainerCommand(value string) *UserTaskApplyConfiguration {
	b.ContainerCommand = &value
	return b
}

// WithContainerCommands adds the given value to the ContainerCommands field in the declarative configuration
// and returns the receiver, so that objects can be build by chaining "With" function invocations.
// If called multiple times, values provided by each call will be appended to the ContainerCommands field.
func (b *UserTaskApplyConfiguration) WithContainerCommands(values ...string) *UserTaskApplyConfiguration {
	for i := range values {
		b.ContainerCommands = append(b.ContainerCommands, values[i])
	}
	return b
}
