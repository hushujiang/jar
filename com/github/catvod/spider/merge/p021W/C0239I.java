package com.github.catvod.spider.merge.p021W;

import java.util.Calendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.W.I */
/* loaded from: classes.dex */
public final class C0239I implements InterfaceC0271x {

    /* renamed from: a */
    private final int f427a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0239I(int i) {
        this.f427a = i;
    }

    @Override // com.github.catvod.spider.merge.p021W.InterfaceC0271x
    /* renamed from: a */
    public final void mo1076a(Appendable appendable, int i) {
        if (i < 100) {
            C0244N.m1108a(appendable, i);
        } else {
            C0244N.m1107b(appendable, i, 2);
        }
    }

    @Override // com.github.catvod.spider.merge.p021W.InterfaceC0273z
    /* renamed from: b */
    public final void mo1075b(Appendable appendable, Calendar calendar) {
        mo1076a(appendable, calendar.get(this.f427a));
    }

    @Override // com.github.catvod.spider.merge.p021W.InterfaceC0273z
    /* renamed from: c */
    public final int mo1074c() {
        return 2;
    }
}
