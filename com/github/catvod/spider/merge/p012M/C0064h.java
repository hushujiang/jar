package com.github.catvod.spider.merge.p012M;

/* renamed from: com.github.catvod.spider.merge.M.h */
/* loaded from: classes.dex */
class C0064h extends C0063g {
    /* renamed from: a */
    public static final int m1395a(CharSequence charSequence, String str, int i, boolean z) {
        return (z || !(charSequence instanceof String)) ? m1394b(charSequence, str, i, charSequence.length(), z) : ((String) charSequence).indexOf(str, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091 A[EDGE_INSN: B:53:0x0091->B:46:0x0091 ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static int m1394b(java.lang.CharSequence r9, java.lang.CharSequence r10, int r11, int r12, boolean r13) {
        /*
            r0 = -1
            r1 = 0
            if (r11 >= 0) goto L5
            r11 = 0
        L5:
            com.github.catvod.spider.merge.L.c r2 = new com.github.catvod.spider.merge.L.c
            int r3 = r9.length()
            if (r12 <= r3) goto Le
            r12 = r3
        Le:
            r2.<init>(r11, r12)
            boolean r11 = r9 instanceof java.lang.String
            if (r11 == 0) goto L4b
            boolean r11 = r10 instanceof java.lang.String
            if (r11 == 0) goto L4b
            int r11 = r2.m1403a()
            int r12 = r2.m1402b()
            int r2 = r2.m1401c()
            if (r2 < 0) goto L2a
            if (r11 > r12) goto L97
            goto L2c
        L2a:
            if (r11 < r12) goto L97
        L2c:
            r3 = r10
            java.lang.String r3 = (java.lang.String) r3
            r6 = r9
            java.lang.String r6 = (java.lang.String) r6
            int r8 = r10.length()
            if (r13 != 0) goto L3d
            boolean r3 = r3.regionMatches(r1, r6, r11, r8)
            goto L44
        L3d:
            r5 = 0
            r4 = r13
            r7 = r11
            boolean r3 = r3.regionMatches(r4, r5, r6, r7, r8)
        L44:
            if (r3 == 0) goto L47
            goto L91
        L47:
            if (r11 == r12) goto L97
            int r11 = r11 + r2
            goto L2c
        L4b:
            int r11 = r2.m1403a()
            int r12 = r2.m1402b()
            int r2 = r2.m1401c()
            if (r2 < 0) goto L5c
            if (r11 > r12) goto L97
            goto L5e
        L5c:
            if (r11 < r12) goto L97
        L5e:
            int r3 = r10.length()
            if (r11 < 0) goto L8e
            int r4 = r10.length()
            int r4 = r4 - r3
            if (r4 < 0) goto L8e
            int r4 = r9.length()
            int r4 = r4 - r3
            if (r11 <= r4) goto L73
            goto L8e
        L73:
            r4 = 0
        L74:
            if (r4 >= r3) goto L8c
            int r5 = r1 + r4
            char r5 = r10.charAt(r5)
            int r6 = r11 + r4
            char r6 = r9.charAt(r6)
            boolean r5 = com.github.catvod.spider.merge.p012M.C0057a.m1399a(r5, r6, r13)
            if (r5 != 0) goto L89
            goto L8e
        L89:
            int r4 = r4 + 1
            goto L74
        L8c:
            r3 = 1
            goto L8f
        L8e:
            r3 = 0
        L8f:
            if (r3 == 0) goto L93
        L91:
            r0 = r11
            goto L97
        L93:
            if (r11 == r12) goto L97
            int r11 = r11 + r2
            goto L5e
        L97:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p012M.C0064h.m1394b(java.lang.CharSequence, java.lang.CharSequence, int, int, boolean):int");
    }
}
