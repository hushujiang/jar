package com.github.catvod.spider.merge.p010K;

import com.github.catvod.spider.merge.p025a0.C0288h;
import com.github.catvod.spider.merge.p027b0.C0321F;
import com.github.catvod.spider.merge.p028c.C0424a;

/* renamed from: com.github.catvod.spider.merge.K.e */
/* loaded from: classes.dex */
public final class C0052e {
    /* renamed from: a */
    public static String m1418a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            if (i2 >= length2) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        return new String(bArr);
    }

    /* renamed from: b */
    public static boolean m1417b(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: c */
    public static boolean m1416c(CharSequence charSequence, CharSequence charSequence2) {
        char c;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            char charAt2 = charSequence2.charAt(i);
            if (charAt != charAt2 && ((c = (char) ((charAt | ' ') - 97)) >= 26 || c != ((char) ((charAt2 | ' ') - 97)))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static int m1415d(int i, int i2) {
        int i3 = i ^ (i2 * 4);
        int i4 = (i3 ^ (i3 >>> 16)) * (-2048144789);
        int i5 = (i4 ^ (i4 >>> 13)) * (-1028477387);
        return i5 ^ (i5 >>> 16);
    }

    /* renamed from: e */
    public static C0288h m1414e(String str) {
        return C0321F.m846d(str);
    }

    /* renamed from: f */
    public static byte[] m1413f(String str) {
        if (str.length() % 2 == 0) {
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[str.length() / 2];
            int length = str.length();
            int i = 0;
            int i2 = 0;
            while (i < length) {
                StringBuilder m635a = C0424a.m635a("");
                int i3 = i + 1;
                m635a.append(charArray[i]);
                m635a.append(charArray[i3]);
                bArr[i2] = new Integer(Integer.parseInt(m635a.toString(), 16) & 255).byteValue();
                i = i3 + 1;
                i2++;
            }
            return bArr;
        }
        throw new IllegalArgumentException(m1418a(new byte[]{-89, 5, -100, -49, -11, -64, -4, 14, -90, 14, -110, -114, -22, -35, -22, 71, -96, 12}, new byte[]{-50, 107, -22, -82, -103, -87, -104, 46}));
    }

    /* renamed from: g */
    public static String m1412g(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; bArr != null && i < bArr.length; i++) {
            String hexString = Integer.toHexString(bArr[i] & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString().toUpperCase();
    }

    /* renamed from: h */
    public static int m1411h(int i, int i2) {
        int i3 = i2 * (-862048943);
        int i4 = i ^ (((i3 >>> 17) | (i3 << 15)) * 461845907);
        return (((i4 >>> 19) | (i4 << 13)) * 5) - 430675100;
    }

    /* renamed from: i */
    public static int m1410i(int i, Object obj) {
        return m1411h(i, obj != null ? obj.hashCode() : 0);
    }
}
