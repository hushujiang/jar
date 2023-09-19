package com.github.catvod.spider.merge.p021W;

import java.util.Calendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.W.E */
/* loaded from: classes.dex */
public final class C0235E implements InterfaceC0273z {

    /* renamed from: b */
    static final C0235E f421b = new C0235E(true);

    /* renamed from: c */
    static final C0235E f422c = new C0235E(false);

    /* renamed from: a */
    final boolean f423a;

    C0235E(boolean z) {
        this.f423a = z;
    }

    @Override // com.github.catvod.spider.merge.p021W.InterfaceC0273z
    /* renamed from: b */
    public final void mo1075b(Appendable appendable, Calendar calendar) {
        int i = calendar.get(16) + calendar.get(15);
        if (i < 0) {
            ((StringBuilder) appendable).append('-');
            i = -i;
        } else {
            ((StringBuilder) appendable).append('+');
        }
        int i2 = i / 3600000;
        C0244N.m1108a(appendable, i2);
        if (this.f423a) {
            ((StringBuilder) appendable).append(':');
        }
        C0244N.m1108a(appendable, (i / 60000) - (i2 * 60));
    }

    @Override // com.github.catvod.spider.merge.p021W.InterfaceC0273z
    /* renamed from: c */
    public final int mo1074c() {
        return 5;
    }
}
