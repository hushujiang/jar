package com.github.catvod.spider.merge.p018S;

import com.github.catvod.spider.merge.atm;
import java.util.regex.Pattern;

/* renamed from: com.github.catvod.spider.merge.S.h */
/* loaded from: classes.dex */
public final class C0207h {

    /* renamed from: a */
    public static final /* synthetic */ int f362a = 0;

    static {
        Pattern.compile(atm.m897d("360A013C221B0517181C2231041D3E1C2D3B18130E1C2F3906371B07272B1751"));
    }

    /* renamed from: a */
    public static boolean m1174a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return charSequence == charSequence2;
        } else if (charSequence2.length() > charSequence.length()) {
            return false;
        } else {
            return C0200a.m1179b(charSequence, false, charSequence.length() - charSequence2.length(), charSequence2, charSequence2.length());
        }
    }

    /* renamed from: b */
    public static boolean m1173b(CharSequence charSequence) {
        int length = charSequence == null ? 0 : charSequence.length();
        if (length == 0) {
            return true;
        }
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m1172c(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    /* renamed from: d */
    public static boolean m1171d(CharSequence charSequence) {
        return !m1173b(charSequence);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0041 -> B:19:0x0030). Please submit an issue!!! */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m1170e(java.lang.Iterable<?> r3, java.lang.String r4) {
        /*
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.util.Iterator r3 = r3.iterator()
            if (r3 != 0) goto Lb
            goto L49
        Lb:
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L12
            goto L1e
        L12:
            java.lang.Object r0 = r3.next()
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L26
            if (r0 != 0) goto L21
        L1e:
            java.lang.String r0 = ""
            goto L49
        L21:
            java.lang.String r0 = r0.toString()
            goto L49
        L26:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 256(0x100, float:3.59E-43)
            r1.<init>(r2)
            if (r0 == 0) goto L30
            goto L41
        L30:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L45
            if (r4 == 0) goto L3b
            r1.append(r4)
        L3b:
            java.lang.Object r0 = r3.next()
            if (r0 == 0) goto L30
        L41:
            r1.append(r0)
            goto L30
        L45:
            java.lang.String r0 = r1.toString()
        L49:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p018S.C0207h.m1170e(java.lang.Iterable, java.lang.String):java.lang.String");
    }

    /* renamed from: f */
    public static String m1169f(String str, String str2) {
        return (m1172c(str) || m1172c(str2) || !str.endsWith(str2)) ? str : str.substring(0, str.length() - str2.length());
    }

    /* renamed from: g */
    public static String m1168g(String str, String str2) {
        return (m1172c(str) || m1172c(str2) || !str.startsWith(str2)) ? str : str.substring(str2.length());
    }

    /* renamed from: h */
    public static String m1167h(String str, String str2, String str3) {
        if (m1172c(str) || m1172c(str2) || str3 == null) {
            return str;
        }
        int i = 0;
        int m1180a = (str == null || str2 == null) ? -1 : C0200a.m1180a(str, str2, 0);
        if (m1180a == -1) {
            return str;
        }
        int length = str2.length();
        StringBuilder sb = new StringBuilder(str.length() + (Math.max(str3.length() - length, 0) * 16));
        int i2 = -1;
        while (m1180a != -1) {
            sb.append((CharSequence) str, i, m1180a);
            sb.append(str3);
            i = m1180a + length;
            i2--;
            if (i2 == 0) {
                break;
            }
            m1180a = C0200a.m1180a(str, str2, i);
        }
        sb.append((CharSequence) str, i, str.length());
        return sb.toString();
    }

    /* renamed from: i */
    public static String m1166i(String str, int i) {
        if (str == null) {
            return null;
        }
        if (i < 0) {
            i += str.length();
        }
        if (i < 0) {
            i = 0;
        }
        return i > str.length() ? "" : str.substring(i);
    }

    /* renamed from: j */
    public static String m1165j(String str, int i, int i2) {
        if (str == null) {
            return null;
        }
        if (i2 < 0) {
            i2 += str.length();
        }
        if (i < 0) {
            i += str.length();
        }
        if (i2 > str.length()) {
            i2 = str.length();
        }
        if (i > i2) {
            return "";
        }
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        return str.substring(i, i2);
    }
}
