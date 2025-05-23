/*
 * Copyright 2002-2025 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.test.context.junit4;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.annotation.PojoAndStringConfig;

/**
 * Integration tests that verify support for configuration classes in
 * the Spring TestContext Framework.
 *
 * <p>Furthermore, by extending {@code SpringJUnit4ClassRunnerAppCtxTests},
 * this class also verifies support for several basic features of the
 * Spring TestContext Framework. See JavaDoc in
 * {@link SpringJUnit4ClassRunnerAppCtxTests} for details.
 *
 * <p>Configuration will be loaded from {@link PojoAndStringConfig}.
 *
 * @author Sam Brannen
 * @since 3.1
 */
@ContextConfiguration(classes = PojoAndStringConfig.class, inheritLocations = false)
public class AnnotationConfigSpringJUnit4ClassRunnerAppCtxTests extends SpringJUnit4ClassRunnerAppCtxTests {
	/* all tests are in the parent class. */
}
