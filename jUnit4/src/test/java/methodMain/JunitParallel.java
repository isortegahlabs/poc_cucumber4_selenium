package methodMain;

import org.junit.Test;

import cucumber.api.cli.Main;

public class JunitParallel {
    @Test
    public void test() {
        Main.main(new String[]{"--threads", "4","-p","pretty","-g", "stepdef", "src/test/resources/features/"});
    }
}
