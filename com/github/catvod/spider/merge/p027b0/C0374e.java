package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.b0.e */
/* loaded from: classes.dex */
public enum C0374e extends EnumC0313B {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0374e() {
        super(atm.m897d("2314391A202D07143D07232D1A"), 11, null);
    }

    /* renamed from: e */
    private boolean m657e(AbstractC0341P abstractC0341P, C0365b c0365b) {
        if (!c0365b.m648b(atm.m897d("091516123E371F0A"))) {
            c0365b.m668r(this);
            return false;
        }
        c0365b.m694Z();
        c0365b.m665s0(EnumC0313B.f643i);
        c0365b.mo645e(abstractC0341P);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b7, code lost:
        if (r7.equals(r5) == false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bc  */
    @Override // com.github.catvod.spider.merge.p027b0.EnumC0313B
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean mo638d(com.github.catvod.spider.merge.p027b0.AbstractC0341P r12, com.github.catvod.spider.merge.p027b0.C0365b r13) {
        /*
            r11 = this;
            com.github.catvod.spider.merge.b0.u r0 = com.github.catvod.spider.merge.p027b0.EnumC0313B.f638d
            boolean r1 = com.github.catvod.spider.merge.p027b0.EnumC0313B.m860a(r12)
            r2 = 1
            if (r1 == 0) goto Lf
            com.github.catvod.spider.merge.b0.I r12 = (com.github.catvod.spider.merge.p027b0.C0327I) r12
            r13.m711I(r12)
            return r2
        Lf:
            int r1 = r12.f705a
            int r1 = com.github.catvod.spider.merge.p056r.C0653a.m139a(r1)
            if (r1 == 0) goto Ld0
            java.lang.String r3 = "020E1719"
            java.lang.String r3 = com.github.catvod.spider.merge.atm.m897d(r3)
            r4 = 0
            java.lang.String r5 = "1E1F170520391E1F"
            java.lang.String r5 = com.github.catvod.spider.merge.atm.m897d(r5)
            r6 = 2
            if (r1 == r2) goto L7d
            if (r1 == r6) goto L47
            r0 = 3
            if (r1 == r0) goto L40
            r0 = 5
            if (r1 == r0) goto L34
            boolean r12 = r11.m657e(r12, r13)
            return r12
        L34:
            boolean r0 = r13.m648b(r3)
            if (r0 == 0) goto L3b
            return r2
        L3b:
            boolean r12 = r11.m657e(r12, r13)
            return r12
        L40:
            com.github.catvod.spider.merge.b0.J r12 = (com.github.catvod.spider.merge.p027b0.C0329J) r12
            r13.m710J(r12)
            goto Ld3
        L47:
            r1 = r12
            com.github.catvod.spider.merge.b0.M r1 = (com.github.catvod.spider.merge.p027b0.C0335M) r1
            java.lang.String r1 = r1.f695e
            r1.getClass()
            boolean r3 = r1.equals(r5)
            if (r3 != 0) goto L79
            java.lang.String r0 = "091516123E371F0A"
            java.lang.String r0 = com.github.catvod.spider.merge.atm.m897d(r0)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L66
            boolean r12 = r11.m657e(r12, r13)
            return r12
        L66:
            boolean r12 = r13.m648b(r1)
            if (r12 != 0) goto L70
            r13.m668r(r11)
            return r4
        L70:
            r13.m694Z()
            com.github.catvod.spider.merge.b0.z r12 = com.github.catvod.spider.merge.p027b0.EnumC0313B.f643i
            r13.m665s0(r12)
            goto Ld3
        L79:
            r13.m690d0(r12, r0)
            goto Ld3
        L7d:
            r1 = r12
            com.github.catvod.spider.merge.b0.N r1 = (com.github.catvod.spider.merge.p027b0.C0337N) r1
            java.lang.String r7 = r1.f695e
            r7.getClass()
            int r8 = r7.hashCode()
            r9 = -1321546630(0xffffffffb13acc7a, float:-2.7182794E-9)
            r10 = -1
            if (r8 == r9) goto Lb3
            r4 = 98688(0x18180, float:1.38291E-40)
            if (r8 == r4) goto La4
            r4 = 3213227(0x3107ab, float:4.50269E-39)
            if (r8 == r4) goto L9b
        L99:
            r4 = -1
            goto Lba
        L9b:
            boolean r3 = r7.equals(r3)
            if (r3 != 0) goto La2
            goto L99
        La2:
            r4 = 2
            goto Lba
        La4:
            java.lang.String r3 = "091516"
            java.lang.String r3 = com.github.catvod.spider.merge.atm.m897d(r3)
            boolean r3 = r7.equals(r3)
            if (r3 != 0) goto Lb1
            goto L99
        Lb1:
            r4 = 1
            goto Lba
        Lb3:
            boolean r3 = r7.equals(r5)
            if (r3 != 0) goto Lba
            goto L99
        Lba:
            if (r4 == 0) goto L79
            if (r4 == r2) goto Lcc
            if (r4 == r6) goto Lc5
            boolean r12 = r11.m657e(r12, r13)
            return r12
        Lc5:
            com.github.catvod.spider.merge.b0.x r0 = com.github.catvod.spider.merge.p027b0.EnumC0313B.f641g
            boolean r12 = r13.m690d0(r12, r0)
            return r12
        Lcc:
            r13.m709K(r1)
            goto Ld3
        Ld0:
            r13.m668r(r11)
        Ld3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p027b0.C0374e.mo638d(com.github.catvod.spider.merge.b0.P, com.github.catvod.spider.merge.b0.b):boolean");
    }
}
