package cn.reactnative.modules.update;

/**
 * Created by fuli.niu on 2018/3/22.
 */

public class DownloadTask {
    static {
        System.loadLibrary("rnupdate-lib");
    }

    public static native byte[] bsdiffPatch(byte[] origin, byte[] patch);
}
