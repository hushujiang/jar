package com.github.catvod.spider;

import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import com.github.catvod.spider.merge.p028c.C0424a;
import com.github.catvod.spider.merge.p042j.C0574b;
import com.github.catvod.spider.merge.p044k.C0589d;
import com.github.catvod.spider.merge.p044k.C0593h;
import com.github.catvod.spider.merge.p044k.C0595j;
import com.github.catvod.spider.merge.p044k.C0606u;
import com.github.catvod.spider.merge.p048m.C0620d;
import com.github.catvod.spider.merge.p050n.C0629f;
import java.io.ByteArrayInputStream;
import java.util.Map;

/* loaded from: classes.dex */
public class Proxy extends Spider {

    /* renamed from: a */
    private static int f25a = -1;

    public static String getUrl() {
        int i = f25a;
        String m897d = atm.m897d("020E0E057677454B48426268444A544476");
        if (i <= 0) {
            int i2 = 9978;
            while (true) {
                if (i2 >= 10000) {
                    break;
                }
                if (C0574b.m307f(m897d + i2 + atm.m897d("450A081A3421551E15482F33"), null, null).equals(atm.m897d("0511"))) {
                    SpiderDebug.log(atm.m897d("2C150F1B2878061519142078191F0803292A4A0A15073878") + i2);
                    f25a = i2;
                    break;
                }
                i2++;
            }
        }
        StringBuilder m635a = C0424a.m635a(m897d);
        m635a.append(f25a);
        m635a.append(atm.m897d("450A081A3421"));
        return m635a.toString();
    }

    public static Object[] proxy(Map<String, String> map) {
        String str = map.get(atm.m897d("0E15"));
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -791803963:
                if (str.equals(atm.m897d("1D1F18112D2E"))) {
                    c = 0;
                    break;
                }
                break;
            case 3176:
                if (str.equals(atm.m897d("0911"))) {
                    c = 1;
                    break;
                }
                break;
            case 96670:
                if (str.equals(atm.m897d("0B1613"))) {
                    c = 2;
                    break;
                }
                break;
            case 3078841:
                if (str.equals(atm.m897d("0E1E081E"))) {
                    c = 3;
                    break;
                }
                break;
            case 93167842:
                if (str.equals(atm.m897d("0B0F1F0129"))) {
                    c = 4;
                    break;
                }
                break;
            case 95177180:
                if (str.equals(atm.m897d("090009053C"))) {
                    c = 5;
                    break;
                }
                break;
            case 114047337:
                if (str.equals(atm.m897d("12131B1A24"))) {
                    c = 6;
                    break;
                }
                break;
        }
        String m897d = atm.m897d("1F0816");
        switch (c) {
            case 0:
                return WebDAV.vod(map);
            case 1:
                return new Object[]{200, atm.m897d("1E1F02016328061B131B777809121B073F3D1E470F012A7552"), new ByteArrayInputStream(atm.m897d("0511").getBytes(atm.m897d("3F2E3C5874")))};
            case 2:
                return Ali.proxy(map);
            case 3:
                return C0595j.m279d(map.get(m897d));
            case 4:
                int i = C0589d.f1066i;
                String str2 = map.get(C0052e.m1418a(new byte[]{-105, 41, -1}, new byte[]{-30, 91, -109, -119, 36, -72, -115, 13}));
                if (C0052e.m1418a(new byte[]{10, -4, 90, 107}, new byte[]{103, -49, 47, 83, -12, -40, -111, -14}).equals(map.get(C0052e.m1418a(new byte[]{Byte.MAX_VALUE, -49, 82, 87}, new byte[]{11, -74, 34, 50, 21, 54, 119, -74})))) {
                    return new Object[]{200, C0052e.m1418a(new byte[]{-37, 47, 82, 11, 28, 0, -3, -53, -45, 48, 76, 72, 26, 0, -24, -38, -50, 114, 81, 19, 7, 6, -3, -46}, new byte[]{-70, 95, 34, 103, 117, 99, -100, -65}), new ByteArrayInputStream(C0574b.m307f(new String(Base64.decode(str2, 10), C0620d.f1187b), null, null).replaceAll(C0052e.m1418a(new byte[]{100, 55, 103, -113, 95, -41, 8, 64, 104, 32, 86, -56, 125, -41, 9, 54, 34, 33}, new byte[]{76, 8, 10, -90, 1, -117, 123, 106}), "").getBytes())};
                }
                return null;
            case 5:
                return C0593h.m284d(map.get(m897d));
            case 6:
                int i2 = C0606u.f1152h;
                String str3 = map.get(C0052e.m1418a(new byte[]{-85, -25, -126}, new byte[]{-34, -107, -18, -76, -25, -74, -33, -118}));
                if (C0052e.m1418a(new byte[]{24, -23, 60, -78}, new byte[]{117, -38, 73, -118, -82, -100, 62, 19}).equals(map.get(C0052e.m1418a(new byte[]{39, -80, 61, -38}, new byte[]{83, -55, 77, -65, 94, 97, -49, 119})))) {
                    return new Object[]{200, C0052e.m1418a(new byte[]{111, -50, -104, 96, -36, 25, 32, 76, 103, -47, -122, 35, -38, 25, 53, 93, 122, -109, -101, 120, -57, 31, 32, 85}, new byte[]{14, -66, -24, 12, -75, 122, 65, 56}), new ByteArrayInputStream(C0629f.m179f(new String(Base64.decode(str3, 10), C0620d.f1187b), null).replaceAll(C0052e.m1418a(new byte[]{-66, Byte.MIN_VALUE, -37, 33, 108, 63, 126, -12, -44, -106, -64, 58, 15, 51, 26, -2, -56, -116, -41, 44, 105, 73, 121, -103, -66, Byte.MIN_VALUE, -37, 33, 108, 63, 126, -12, -44, -106, -64, 58, 15, 51, 26, -2, -56, -116, -41, 44, 105, 59, 61, -52, -63, -73, -33, 27, 104}, new byte[]{-99, -59, -125, 117, 65, 103, 83, -80}), "").getBytes())};
                }
                return null;
            default:
                return null;
        }
    }
}
