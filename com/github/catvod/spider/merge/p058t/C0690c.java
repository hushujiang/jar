package com.github.catvod.spider.merge.p058t;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.t.c */
/* loaded from: classes.dex */
final class C0690c extends C0692e {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0690c(java.lang.String r2, java.lang.String r3, java.lang.Character r4) {
        /*
            r1 = this;
            com.github.catvod.spider.merge.t.a r0 = new com.github.catvod.spider.merge.t.a
            char[] r3 = r3.toCharArray()
            r0.<init>(r2, r3)
            r1.<init>(r0, r4)
            char[] r2 = com.github.catvod.spider.merge.p058t.C0688a.m97a(r0)
            int r2 = r2.length
            r3 = 64
            if (r2 != r3) goto L17
            r2 = 1
            goto L18
        L17:
            r2 = 0
        L18:
            com.github.catvod.spider.merge.p056r.C0665m.m130b(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p058t.C0690c.<init>(java.lang.String, java.lang.String, java.lang.Character):void");
    }

    @Override // com.github.catvod.spider.merge.p058t.C0692e, com.github.catvod.spider.merge.p058t.AbstractC0693f
    /* renamed from: c */
    final int mo90c(byte[] bArr, CharSequence charSequence) {
        CharSequence mo89d = mo89d(charSequence);
        if (!this.f1308b.m94d(mo89d.length())) {
            int length = mo89d.length();
            StringBuilder sb = new StringBuilder(32);
            sb.append(atm.m897d("23140C1420310E5A131B3C2D1E5A1610223F1E125A"));
            sb.append(length);
            throw new C0691d(sb.toString());
        }
        int i = 0;
        int i2 = 0;
        while (i < mo89d.length()) {
            int i3 = i + 1;
            int i4 = i3 + 1;
            int m96b = (this.f1308b.m96b(mo89d.charAt(i)) << 18) | (this.f1308b.m96b(mo89d.charAt(i3)) << 12);
            int i5 = i2 + 1;
            bArr[i2] = (byte) (m96b >>> 16);
            if (i4 < mo89d.length()) {
                int i6 = i4 + 1;
                int m96b2 = m96b | (this.f1308b.m96b(mo89d.charAt(i4)) << 6);
                i2 = i5 + 1;
                bArr[i5] = (byte) ((m96b2 >>> 8) & 255);
                if (i6 < mo89d.length()) {
                    i4 = i6 + 1;
                    i5 = i2 + 1;
                    bArr[i2] = (byte) ((m96b2 | this.f1308b.m96b(mo89d.charAt(i6))) & 255);
                } else {
                    i = i6;
                }
            }
            i2 = i5;
            i = i4;
        }
        return i2;
    }
}
