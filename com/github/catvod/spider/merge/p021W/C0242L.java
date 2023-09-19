package com.github.catvod.spider.merge.p021W;

import java.util.Calendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.W.L */
/* loaded from: classes.dex */
public final class C0242L implements InterfaceC0271x {

    /* renamed from: a */
    private final int f430a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0242L(int i) {
        this.f430a = i;
    }

    @Override // com.github.catvod.spider.merge.p021W.InterfaceC0271x
    /* renamed from: a */
    public final void mo1076a(Appendable appendable, int i) {
        if (i < 10) {
            ((StringBuilder) appendable).append((char) (i + 48));
        } else if (i < 100) {
            C0244N.m1108a(appendable, i);
        } else {
            C0244N.m1107b(appendable, i, 1);
        }
    }

    @Override // com.github.catvod.spider.merge.p021W.InterfaceC0273z
    /* renamed from: b */
    public final void mo1075b(Appendable appendable, Calendar calendar) {
        mo1076a(appendable, calendar.get(this.f430a));
    }

    @Override // com.github.catvod.spider.merge.p021W.InterfaceC0273z
    /* renamed from: c */
    public final int mo1074c() {
        return 4;
    }
}
