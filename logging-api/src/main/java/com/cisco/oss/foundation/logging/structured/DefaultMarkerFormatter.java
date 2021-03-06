/*
 * Copyright 2015 Cisco Systems, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.cisco.oss.foundation.logging.structured;

/**
 * Default formatter for use when User Marker doesn't have any annotations or configuration overrides
 * @author Yair Ogen
 */
public class DefaultMarkerFormatter implements FoundationLoggingMarkerFormatter {

	@Override
	public String getFormat(String appenderName) {
		return null;
	}

	@Override
	public void setMarker(FoundationLoggingMarker marker) {
	}

}
