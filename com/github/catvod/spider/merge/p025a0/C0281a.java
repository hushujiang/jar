package com.github.catvod.spider.merge.p025a0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p022X.C0274a;
import com.github.catvod.spider.merge.p023Y.C0277c;
import com.github.catvod.spider.merge.p024Z.C0280b;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.github.catvod.spider.merge.a0.a */
/* loaded from: classes.dex */
public final class C0281a implements Map.Entry<String, String>, Cloneable {

    /* renamed from: d */
    private static final String[] f510d = {atm.m897d("0B16161A3B3E1F1616062F2A0F1F14"), atm.m897d("0B09031B2F"), atm.m897d("0B0F0E1A2A37090F09"), atm.m897d("09121F16273D0E"), atm.m897d("091517052D3B1E"), atm.m897d("0E1F19192D2A0F"), atm.m897d("0E1F1C1439341E"), atm.m897d("0E1F1C103E"), atm.m897d("0E1309142E340F1E"), atm.m897d("0C15081822371C1B161C28391E1F"), atm.m897d("02131E112936"), atm.m897d("03141F0738"), atm.m897d("030917143C"), atm.m897d("030E1F183F3B050A1F"), atm.m897d("070F16012528061F"), atm.m897d("070F0E1028"), atm.m897d("04151207293E"), atm.m897d("041508103F31101F"), atm.m897d("0415091D2D3C0F"), atm.m897d("04150C1420310E1B0E10"), atm.m897d("04150D072D28"), atm.m897d("050A1F1B"), atm.m897d("181F1B1123360603"), atm.m897d("181F0B00252A0F1E"), atm.m897d("181F0C103E2B0F1E"), atm.m897d("191F1B18203D1909"), atm.m897d("191F16102F2C0F1E"), atm.m897d("191508012D3A061F"), atm.m897d("1E080F103F280F1F1E"), atm.m897d("1E030A10212D190E1714383B02")};

    /* renamed from: e */
    private static final Pattern f511e = Pattern.compile(atm.m897d("311B570F0D753025402817750B57003461025A57432A76763750"));

    /* renamed from: f */
    private static final Pattern f512f = Pattern.compile(atm.m897d("3124571461222B572045616135405428"));

    /* renamed from: g */
    private static final Pattern f513g = Pattern.compile(atm.m897d("3124260D7C68472602442A04124D1C581020531C5A576B77572751"));

    /* renamed from: h */
    private static final Pattern f514h = Pattern.compile(atm.m897d("312602457C7536024B1310205D1C572934610C5A5852636537"));

    /* renamed from: a */
    private String f515a;

    /* renamed from: b */
    private String f516b;

    /* renamed from: c */
    C0283c f517c;

    public C0281a(String str, String str2, C0283c c0283c) {
        C0277c.m1063l(str);
        String trim = str.trim();
        C0277c.m1065j(trim);
        this.f515a = trim;
        this.f516b = str2;
        this.f517c = c0283c;
    }

    /* renamed from: b */
    public static String m1047b(String str, int i) {
        if (i == 2) {
            Pattern pattern = f511e;
            if (!pattern.matcher(str).matches()) {
                String replaceAll = f512f.matcher(str).replaceAll("");
                if (pattern.matcher(replaceAll).matches()) {
                    return replaceAll;
                }
                return null;
            }
        }
        if (i == 1) {
            Pattern pattern2 = f513g;
            if (!pattern2.matcher(str).matches()) {
                String replaceAll2 = f514h.matcher(str).replaceAll("");
                if (pattern2.matcher(replaceAll2).matches()) {
                    return replaceAll2;
                }
                return null;
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
        if ((java.util.Arrays.binarySearch(com.github.catvod.spider.merge.p025a0.C0281a.f510d, com.github.catvod.spider.merge.p029c0.C0441O.m624a(r7)) >= 0) != false) goto L13;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m1045d(java.lang.String r7, java.lang.String r8, java.lang.Appendable r9, com.github.catvod.spider.merge.p025a0.C0287g r10) {
        /*
            r9.append(r7)
            int r0 = r10.m1011h()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L2b
            if (r8 == 0) goto L2a
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L19
            boolean r0 = r8.equalsIgnoreCase(r7)
            if (r0 == 0) goto L2b
        L19:
            java.lang.String[] r0 = com.github.catvod.spider.merge.p025a0.C0281a.f510d
            java.lang.String r7 = com.github.catvod.spider.merge.p029c0.C0441O.m624a(r7)
            int r7 = java.util.Arrays.binarySearch(r0, r7)
            if (r7 < 0) goto L27
            r7 = 1
            goto L28
        L27:
            r7 = 0
        L28:
            if (r7 == 0) goto L2b
        L2a:
            r1 = 1
        L2b:
            if (r1 != 0) goto L48
            java.lang.String r7 = "5758"
            java.lang.String r7 = com.github.catvod.spider.merge.atm.m897d(r7)
            r9.append(r7)
            java.lang.String r1 = com.github.catvod.spider.merge.p025a0.C0283c.m1036i(r8)
            r3 = 1
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r9
            r2 = r10
            com.github.catvod.spider.merge.p025a0.C0295o.m944d(r0, r1, r2, r3, r4, r5, r6)
            r7 = 34
            r9.append(r7)
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p025a0.C0281a.m1045d(java.lang.String, java.lang.String, java.lang.Appendable, com.github.catvod.spider.merge.a0.g):void");
    }

    /* renamed from: a */
    public final String m1048a() {
        return this.f515a;
    }

    @Override // java.util.Map.Entry
    /* renamed from: c */
    public final String getValue() {
        return C0283c.m1036i(this.f516b);
    }

    public final Object clone() {
        try {
            return (C0281a) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0281a.class != obj.getClass()) {
            return false;
        }
        C0281a c0281a = (C0281a) obj;
        String str = this.f515a;
        if (str == null ? c0281a.f515a == null : str.equals(c0281a.f515a)) {
            String str2 = this.f516b;
            String str3 = c0281a.f516b;
            return str2 != null ? str2.equals(str3) : str3 == null;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final String getKey() {
        return this.f515a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        String str = this.f515a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f516b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final String setValue(String str) {
        int m1028q;
        String str2 = str;
        String str3 = this.f516b;
        C0283c c0283c = this.f517c;
        if (c0283c != null && (m1028q = c0283c.m1028q(this.f515a)) != -1) {
            str3 = this.f517c.m1033l(this.f515a);
            this.f517c.f522c[m1028q] = str2;
        }
        this.f516b = str2;
        return C0283c.m1036i(str3);
    }

    public final String toString() {
        StringBuilder m1058b = C0280b.m1058b();
        try {
            C0287g m1009B0 = new C0288h("").m1009B0();
            String str = this.f515a;
            String str2 = this.f516b;
            String m1047b = m1047b(str, m1009B0.m1011h());
            if (m1047b != null) {
                m1045d(m1047b, str2, m1058b, m1009B0);
            }
            return C0280b.m1052h(m1058b);
        } catch (IOException e) {
            throw new C0274a(e);
        }
    }
}
