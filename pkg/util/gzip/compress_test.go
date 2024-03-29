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

package gzip

import (
	"bytes"
	"testing"

	"github.com/stretchr/testify/assert"
)

func TestCompression(t *testing.T) {
	source := "this is a script"
	var compressed bytes.Buffer
	err := Compress(&compressed, []byte(source))
	assert.Nil(t, err)
	var uncompressed bytes.Buffer
	err = Uncompress(&uncompressed, compressed.Bytes())
	assert.Nil(t, err)
	assert.Equal(t, source, uncompressed.String())
}

func TestCompression64(t *testing.T) {
	source := "this is a script"
	compressed, err := CompressBase64([]byte(source))
	assert.Nil(t, err)
	uncompressed, err := UncompressBase64(compressed)
	assert.Nil(t, err)
	assert.Equal(t, source, string(uncompressed))
}
