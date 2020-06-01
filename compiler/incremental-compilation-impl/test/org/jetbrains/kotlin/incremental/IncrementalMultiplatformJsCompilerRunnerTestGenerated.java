/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.incremental;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/incremental-compilation-impl/testData/incremental/mpp/allPlatforms")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class IncrementalMultiplatformJsCompilerRunnerTestGenerated extends AbstractIncrementalMultiplatformJsCompilerRunnerTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInAllPlatforms() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/incremental-compilation-impl/testData/incremental/mpp/allPlatforms"), Pattern.compile("^([^\\.]+)$"), null, true);
    }

    @TestMetadata("touchActual")
    public void testTouchActual() throws Exception {
        runTest("compiler/incremental-compilation-impl/testData/incremental/mpp/allPlatforms/touchActual/");
    }

    @TestMetadata("touchExpect")
    public void testTouchExpect() throws Exception {
        runTest("compiler/incremental-compilation-impl/testData/incremental/mpp/allPlatforms/touchExpect/");
    }

    @TestMetadata("compiler/incremental-compilation-impl/testData/incremental/mpp/allPlatforms/touchActual")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class TouchActual extends AbstractIncrementalMultiplatformJsCompilerRunnerTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInTouchActual() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/incremental-compilation-impl/testData/incremental/mpp/allPlatforms/touchActual"), Pattern.compile("^([^\\.]+)$"), null, true);
        }
    }

    @TestMetadata("compiler/incremental-compilation-impl/testData/incremental/mpp/allPlatforms/touchExpect")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class TouchExpect extends AbstractIncrementalMultiplatformJsCompilerRunnerTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInTouchExpect() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/incremental-compilation-impl/testData/incremental/mpp/allPlatforms/touchExpect"), Pattern.compile("^([^\\.]+)$"), null, true);
        }
    }
}
