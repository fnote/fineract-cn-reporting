/*
 * Copyright 2017 The Mifos Initiative.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.mifos.reporting.api.v1.domain;

import java.util.List;

public class Header {

  private List<String> columnNames;

  public Header() {
    super();
  }

  public List<String> getColumnNames() {
    return this.columnNames;
  }

  public void setColumnNames(final List<String> columnNames) {
    this.columnNames = columnNames;
  }
}