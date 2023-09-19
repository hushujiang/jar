package com.github.catvod.spider.merge.p058t;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.t.b */
/* loaded from: classes.dex */
final class C0689b extends C0692e {

    /* renamed from: d */
    final char[] f1307d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0689b() {
        /*
            r5 = this;
            com.github.catvod.spider.merge.t.a r0 = new com.github.catvod.spider.merge.t.a
            java.lang.String r1 = "5A4B4846786D5C4D424C0D1A293E3F33"
            java.lang.String r1 = com.github.catvod.spider.merge.atm.m897d(r1)
            char[] r1 = r1.toCharArray()
            java.lang.String r2 = "081B09107D6E4253"
            java.lang.String r2 = com.github.catvod.spider.merge.atm.m897d(r2)
            r0.<init>(r2, r1)
            r1 = 0
            r5.<init>(r0, r1)
            r1 = 512(0x200, float:7.17E-43)
            char[] r1 = new char[r1]
            r5.f1307d = r1
            char[] r1 = com.github.catvod.spider.merge.p058t.C0688a.m97a(r0)
            int r1 = r1.length
            r2 = 0
            r3 = 16
            if (r1 != r3) goto L2b
            r1 = 1
            goto L2c
        L2b:
            r1 = 0
        L2c:
            com.github.catvod.spider.merge.p056r.C0665m.m130b(r1)
        L2f:
            r1 = 256(0x100, float:3.59E-43)
            if (r2 >= r1) goto L4c
            char[] r1 = r5.f1307d
            int r3 = r2 >>> 4
            char r3 = r0.m95c(r3)
            r1[r2] = r3
            char[] r1 = r5.f1307d
            r3 = r2 | 256(0x100, float:3.59E-43)
            r4 = r2 & 15
            char r4 = r0.m95c(r4)
            r1[r3] = r4
            int r2 = r2 + 1
            goto L2f
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p058t.C0689b.<init>():void");
    }

    @Override // com.github.catvod.spider.merge.p058t.C0692e, com.github.catvod.spider.merge.p058t.AbstractC0693f
    /* renamed from: c */
    final int mo90c(byte[] bArr, CharSequence charSequence) {
        if (charSequence.length() % 2 == 1) {
            int length = charSequence.length();
            StringBuilder sb = new StringBuilder(32);
            sb.append(atm.m897d("23140C1420310E5A131B3C2D1E5A1610223F1E125A"));
            sb.append(length);
            throw new C0691d(sb.toString());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            bArr[i2] = (byte) ((this.f1308b.m96b(charSequence.charAt(i)) << 4) | this.f1308b.m96b(charSequence.charAt(i + 1)));
            i += 2;
            i2++;
        }
        return i2;
    }
}
