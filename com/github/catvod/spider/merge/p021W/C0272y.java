package com.github.catvod.spider.merge.p021W;

import java.util.Calendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.W.y */
/* loaded from: classes.dex */
public final class C0272y implements InterfaceC0271x {

    /* renamed from: a */
    private final int f500a;

    /* renamed from: b */
    private final int f501b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0272y(int i, int i2) {
        if (i2 < 3) {
            throw new IllegalArgumentException();
        }
        this.f500a = i;
        this.f501b = i2;
    }

    @Override // com.github.catvod.spider.merge.p021W.InterfaceC0271x
    /* renamed from: a */
    public final void mo1076a(Appendable appendable, int i) {
        C0244N.m1107b(appendable, i, this.f501b);
    }

    @Override // com.github.catvod.spider.merge.p021W.InterfaceC0273z
    /* renamed from: b */
    public final void mo1075b(Appendable appendable, Calendar calendar) {
        mo1076a(appendable, calendar.get(this.f500a));
    }

    @Override // com.github.catvod.spider.merge.p021W.InterfaceC0273z
    /* renamed from: c */
    public final int mo1074c() {
        return this.f501b;
    }
}
