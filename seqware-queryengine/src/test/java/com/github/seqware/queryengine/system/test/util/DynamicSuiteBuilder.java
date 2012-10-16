/*
 * Copyright (C) 2012 SeqWare
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.github.seqware.queryengine.system.test.util;

import com.github.seqware.queryengine.system.test.CommandLineUtilsTest;
import com.github.seqware.queryengine.system.test.GVFImportExportTest;
import com.github.seqware.queryengine.system.test.OBOParserTest;
import com.github.seqware.queryengine.system.test.QueryVCFDumperTest;
import com.github.seqware.queryengine.system.test.SOFeatureImporterTest;
import com.github.seqware.queryengine.system.test.VCFImportExportTest;
import org.junit.runner.RunWith;

/**
 * Add tests here to have them run against the command-line tools
 *
 * @author dyuen
 * @version $Id: $Id
 * @since 0.13.3
 */
@RunWith(DynamicSuite.class)
public class DynamicSuiteBuilder {
    
    private static Class<?>[] SystemTests = {GVFImportExportTest.class, VCFImportExportTest.class, CommandLineUtilsTest.class, OBOParserTest.class, SOFeatureImporterTest.class, QueryVCFDumperTest.class};
    
    /**
     * <p>modelSuite.</p>
     *
     * @return an array of {@link java.lang.Class} objects.
     */
    public static Class[] modelSuite() {
         return DynamicSuiteBuilder.SystemTests;
   }
}
