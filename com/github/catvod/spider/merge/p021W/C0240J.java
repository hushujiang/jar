package com.github.catvod.spider.merge.p021W;

import java.util.Calendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.W.J */
/* loaded from: classes.dex */
public final class C0240J implements InterfaceC0271x {

    /* renamed from: a */
    static final C0240J f428a = new C0240J();

    C0240J() {
    }

    @Override // com.github.catvod.spider.merge.p021W.InterfaceC0271x
    /* renamed from: a */
    public final void mo1076a(Appendable appendable, int i) {
        C0244N.m1108a(appendable, i % 100);
    }

    @Override // com.github.catvod.spider.merge.p021W.InterfaceC0273z
    /* renamed from: b */
    public final void mo1075b(Appendable appendable, Calendar calendar) {
        mo1076a(appendable, calendar.get(1) % 100);
    }

    @Override // com.github.catvod.spider.merge.p021W.InterfaceC0273z
    /* renamed from: c */
    public final int mo1074c() {
        return 2;
    }
}
