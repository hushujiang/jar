package com.github.catvod.spider.merge.p012M;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0053f;

/* renamed from: com.github.catvod.spider.merge.M.c */
/* loaded from: classes.dex */
public final class C0059c extends C0065i {
    /* renamed from: c */
    public static boolean m1398c(CharSequence charSequence) {
        return C0064h.m1395a(charSequence, atm.m897d("0D1F0E06233B01141B1829780C1B1319293C"), 0, false) >= 0;
    }

    /* renamed from: d */
    public static int m1397d(CharSequence charSequence, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return ((String) charSequence).indexOf(46, i);
    }

    /* renamed from: e */
    public static String m1396e(String str, String str2, String str3) {
        int m1395a = C0064h.m1395a(str, str2, 0, false);
        if (m1395a < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            int i2 = 0;
            do {
                sb.append((CharSequence) str, i2, m1395a);
                sb.append(str3);
                i2 = m1395a + length;
                if (m1395a >= str.length()) {
                    break;
                }
                m1395a = C0064h.m1395a(str, str2, m1395a + i, false);
            } while (m1395a > 0);
            sb.append((CharSequence) str, i2, str.length());
            String sb2 = sb.toString();
            C0053f.m1407c(sb2, atm.m897d("190E081C223F280F1319283D18541B053C3D041E5201243119565A1C6078061F1412383043540E1A1F2C181314126471"));
            return sb2;
        }
        throw new OutOfMemoryError();
    }
}
