/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.mahout.flinkbindings.io

/**
 * High level Hadoop version-specific hdfs manipulations we need in context of our operations.
 *
 * Copied from /spark/src/main/scala/org/apache/mahout/common
 */
trait HDFSUtil {

  /**
   *  Read DRM header information off (H)DFS.
   */
  def readDrmHeader(path: String): DrmMetadata

}
