package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p023Y.C0277c;
import com.github.catvod.spider.merge.p024Z.C0280b;

/* renamed from: com.github.catvod.spider.merge.b0.Q */
/* loaded from: classes.dex */
public final class C0343Q {

    /* renamed from: a */
    private String f708a;

    /* renamed from: b */
    private int f709b = 0;

    public C0343Q(String str) {
        C0277c.m1063l(str);
        this.f708a = str;
    }

    /* renamed from: o */
    public static String m786o(String str) {
        StringBuilder m1058b = C0280b.m1058b();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        char c = 0;
        while (i < length) {
            char c2 = charArray[i];
            if (c2 != '\\' || c == '\\') {
                m1058b.append(c2);
            }
            i++;
            c = c2;
        }
        return C0280b.m1052h(m1058b);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0087 A[LOOP:0: B:3:0x0009->B:45:0x0087, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0056 A[EDGE_INSN: B:47:0x0056->B:38:0x0056 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m800a(char r12, char r13) {
        /*
            r11 = this;
            r0 = -1
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = -1
            r6 = -1
            r7 = 0
            r8 = 0
        L9:
            boolean r9 = r11.m792i()
            if (r9 == 0) goto L10
            goto L56
        L10:
            char r9 = r11.m798c()
            r10 = 92
            if (r2 == r10) goto L42
            r10 = 39
            if (r9 != r10) goto L23
            if (r9 == r12) goto L23
            if (r3 != 0) goto L23
            r4 = r4 ^ 1
            goto L2d
        L23:
            r10 = 34
            if (r9 != r10) goto L2d
            if (r9 == r12) goto L2d
            if (r4 != 0) goto L2d
            r3 = r3 ^ 1
        L2d:
            if (r4 != 0) goto L54
            if (r3 != 0) goto L54
            if (r8 == 0) goto L34
            goto L54
        L34:
            if (r9 != r12) goto L3d
            int r7 = r7 + 1
            if (r5 != r0) goto L4d
            int r5 = r11.f709b
            goto L4d
        L3d:
            if (r9 != r13) goto L4d
            int r7 = r7 + (-1)
            goto L4d
        L42:
            r10 = 81
            if (r9 != r10) goto L48
            r8 = 1
            goto L4d
        L48:
            r10 = 69
            if (r9 != r10) goto L4d
            r8 = 0
        L4d:
            if (r7 <= 0) goto L54
            if (r2 == 0) goto L54
            int r2 = r11.f709b
            r6 = r2
        L54:
            if (r7 > 0) goto L87
        L56:
            if (r6 < 0) goto L5f
            java.lang.String r12 = r11.f708a
            java.lang.String r12 = r12.substring(r5, r6)
            goto L61
        L5f:
            java.lang.String r12 = ""
        L61:
            if (r7 > 0) goto L64
            return r12
        L64:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "2E131E5522371E5A1C1C223C4A181B192D36091F1E55213918111F076C391E5A5D"
            java.lang.String r0 = com.github.catvod.spider.merge.atm.m897d(r0)
            r13.append(r0)
            r13.append(r12)
            java.lang.String r12 = "4D"
            java.lang.String r12 = com.github.catvod.spider.merge.atm.m897d(r12)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            com.github.catvod.spider.merge.p023Y.C0277c.m1071d(r12)
            r12 = 0
            throw r12
        L87:
            r2 = r9
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p027b0.C0343Q.m800a(char, char):java.lang.String");
    }

    /* renamed from: b */
    public final String m799b() {
        String m787n;
        String str = this.f708a;
        int i = this.f709b;
        String m897d = atm.m897d("43");
        int indexOf = str.indexOf(m897d, i);
        if (indexOf != -1) {
            m787n = this.f708a.substring(this.f709b, indexOf);
            this.f709b = m787n.length() + this.f709b;
        } else {
            m787n = m787n();
        }
        m791j(m897d);
        return m787n;
    }

    /* renamed from: c */
    public final char m798c() {
        String str = this.f708a;
        int i = this.f709b;
        this.f709b = i + 1;
        return str.charAt(i);
    }

    /* renamed from: d */
    public final void m797d(String str) {
        if (!m790k(str)) {
            throw new IllegalStateException(atm.m897d("3B0F1F0029780E131E5522371E5A1714383B025A1F0D3C3D090E1F116C2B0F0B0F10223B0F"));
        }
        int length = str.length();
        int length2 = this.f708a.length();
        int i = this.f709b;
        if (length > length2 - i) {
            throw new IllegalStateException(atm.m897d("3B0F1F00297804150E552037041D5A1022371F1D125538374A19151B3F2D071F5A0629291F1F141629"));
        }
        this.f709b = i + length;
    }

    /* renamed from: e */
    public final String m796e() {
        int i = this.f709b;
        while (!m792i()) {
            if (!m788m()) {
                char[] cArr = {'-', '_'};
                boolean z = false;
                if (!m792i()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= 2) {
                            break;
                        }
                        if (this.f708a.charAt(this.f709b) == cArr[i2]) {
                            z = true;
                            break;
                        }
                        i2++;
                    }
                }
                if (!z) {
                    break;
                }
            }
            this.f709b++;
        }
        return this.f708a.substring(i, this.f709b);
    }

    /* renamed from: f */
    public final String m795f() {
        int i = this.f709b;
        while (!m792i() && (m788m() || m789l(atm.m897d("4006"), atm.m897d("16"), atm.m897d("35"), atm.m897d("47")))) {
            this.f709b++;
        }
        return this.f708a.substring(i, this.f709b);
    }

    /* renamed from: g */
    public final String m794g(String... strArr) {
        int i = this.f709b;
        while (!m792i() && !m789l(strArr)) {
            this.f709b++;
        }
        return this.f708a.substring(i, this.f709b);
    }

    /* renamed from: h */
    public final boolean m793h() {
        boolean z = false;
        while (true) {
            if (!(!m792i() && C0280b.m1055e(this.f708a.charAt(this.f709b)))) {
                return z;
            }
            this.f709b++;
            z = true;
        }
    }

    /* renamed from: i */
    public final boolean m792i() {
        return this.f708a.length() - this.f709b == 0;
    }

    /* renamed from: j */
    public final boolean m791j(String str) {
        if (m790k(str)) {
            this.f709b = str.length() + this.f709b;
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final boolean m790k(String str) {
        return this.f708a.regionMatches(true, this.f709b, str, 0, str.length());
    }

    /* renamed from: l */
    public final boolean m789l(String... strArr) {
        for (String str : strArr) {
            if (m790k(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public final boolean m788m() {
        return !m792i() && Character.isLetterOrDigit(this.f708a.charAt(this.f709b));
    }

    /* renamed from: n */
    public final String m787n() {
        String substring = this.f708a.substring(this.f709b);
        this.f709b = this.f708a.length();
        return substring;
    }

    public final String toString() {
        return this.f708a.substring(this.f709b);
    }
}
