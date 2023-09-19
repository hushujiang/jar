package com.github.catvod.spider.merge.p013N;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p016Q.C0188j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.N.h */
/* loaded from: classes.dex */
public final class C0083h extends AbstractC0085j {

    /* renamed from: c */
    private final int[] f132c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0083h(int i, int i2, int[] iArr) {
        super(i2);
        this.f132c = iArr;
    }

    @Override // com.github.catvod.spider.merge.p013N.InterfaceC0079d
    /* renamed from: c */
    public final String mo1366c(C0188j c0188j) {
        int min = Math.min(c0188j.f343a, this.f134a);
        return new String(this.f132c, min, Math.min((c0188j.f344b - c0188j.f343a) + 1, this.f134a - min));
    }

    @Override // com.github.catvod.spider.merge.p013N.InterfaceC0093r
    /* renamed from: h */
    public final int mo1343h(int i) {
        int signum = Integer.signum(1);
        if (signum == -1) {
            int i2 = this.f135b + 1;
            if (i2 < 0) {
                return -1;
            }
            return this.f132c[i2];
        } else if (signum != 0) {
            if (signum == 1) {
                int i3 = (this.f135b + 1) - 1;
                if (i3 >= this.f134a) {
                    return -1;
                }
                return this.f132c[i3];
            }
            throw new UnsupportedOperationException(atm.m897d("24150E553E3D0B19121028"));
        } else {
            return 0;
        }
    }
}
