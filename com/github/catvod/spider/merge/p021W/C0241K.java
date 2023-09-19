package com.github.catvod.spider.merge.p021W;

import java.util.Calendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.W.K */
/* loaded from: classes.dex */
public final class C0241K implements InterfaceC0271x {

    /* renamed from: a */
    static final C0241K f429a = new C0241K();

    C0241K() {
    }

    @Override // com.github.catvod.spider.merge.p021W.InterfaceC0271x
    /* renamed from: a */
    public final void mo1076a(Appendable appendable, int i) {
        if (i >= 10) {
            C0244N.m1108a(appendable, i);
            return;
        }
        ((StringBuilder) appendable).append((char) (i + 48));
    }

    @Override // com.github.catvod.spider.merge.p021W.InterfaceC0273z
    /* renamed from: b */
    public final void mo1075b(Appendable appendable, Calendar calendar) {
        mo1076a(appendable, calendar.get(2) + 1);
    }

    @Override // com.github.catvod.spider.merge.p021W.InterfaceC0273z
    /* renamed from: c */
    public final int mo1074c() {
        return 2;
    }
}
