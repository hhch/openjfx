/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.api.tasks;

import javax.annotation.Nullable;

/**
 * Helper interface for binary compatibility with Gradle &lt;4.3 version of the {@link TaskInputs} interface.
 *
 * @deprecated The interface is only here to allow plugins built against Gradle &lt;4.3 to run and it will be removed in Gradle 6.0.
 */
@Deprecated
public interface CompatibilityAdapterForTaskInputs {
    /**
     * <p>Registers an input property for this task. This value is persisted when the task executes, and is compared
     * against the property value for later invocations of the task, to determine if the task is up-to-date.</p>
     *
     * <p>The given value for the property must be Serializable, so that it can be persisted. It should also provide a
     * useful {@code equals()} method.</p>
     *
     * <p>You can specify a closure or {@code Callable} as the value of the property. In which case, the closure or
     * {@code Callable} is executed to determine the actual property value.</p>
     *
     * @param name The name of the property. Must not be null.
     * @param value The value for the property. Can be null.
     */
    TaskInputs property(String name, @Nullable Object value);
}
