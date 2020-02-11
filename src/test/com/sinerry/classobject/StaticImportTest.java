package com.sinerry.classobject;

// 静态导入
/*import staticproxy com.sinerry.classobject.StaticImport.MAX_VALUE;
import staticproxy com.sinerry.classobject.StaticImport.show;*/

// 或者写成
import static com.sinerry.classobject.StaticImport.*;

import org.testng.annotations.Test;

@Test
public class StaticImportTest {
    public void testStaticImport() {
        show(MAX_VALUE);
    }
}
