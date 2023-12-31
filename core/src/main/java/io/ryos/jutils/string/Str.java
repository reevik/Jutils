/*******************************************************************************
 * Copyright (c) 2023 Erhan Bagdemir. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package io.ryos.jutils.string;

public class Str {

  private final String source;

  public Str(String source) {
    this.source = source;
  }

  public static Str of(String source) {
    return new Str(source);
  }

  public boolean isEqualTo(String target) {
    return (source != null && source.equals(target)) || (source == null && target == null);
  }

  public boolean isEmpty() {
    return source == null;
  }
}
