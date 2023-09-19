package com.github.catvod.spider.merge.p013N;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p016Q.C0188j;
import java.nio.charset.StandardCharsets;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.N.i */
/* loaded from: classes.dex */
public final class C0084i extends AbstractC0085j {

    /* renamed from: c */
    private final byte[] f133c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0084i(int i, int i2, byte[] bArr) {
        super(i2);
        this.f133c = bArr;
    }

    @Override // com.github.catvod.spider.merge.p013N.InterfaceC0079d
    /* renamed from: c */
    public final String mo1366c(C0188j c0188j) {
        int min = Math.min(c0188j.f343a, this.f134a);
        return new String(this.f133c, min, Math.min((c0188j.f344b - c0188j.f343a) + 1, this.f134a - min), StandardCharsets.ISO_8859_1);
    }

    @Override // com.github.catvod.spider.merge.p013N.InterfaceC0093r
    /* renamed from: h */
    public final int mo1343h(int i) {
        byte b;
        int signum = Integer.signum(1);
        if (signum == -1) {
            int i2 = this.f135b + 1;
            if (i2 < 0) {
                return -1;
            }
            b = this.f133c[i2];
        } else if (signum == 0) {
            return 0;
        } else {
            if (signum != 1) {
                throw new UnsupportedOperationException(atm.m897d("24150E553E3D0B19121028"));
            }
            int i3 = (this.f135b + 1) - 1;
            if (i3 >= this.f134a) {
                return -1;
            }
            b = this.f133c[i3];
        }
        return b & 255;
    }
}
