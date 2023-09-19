package com.github.catvod.spider.merge.p021W;

import java.util.Calendar;

/* renamed from: com.github.catvod.spider.merge.W.v */
/* loaded from: classes.dex */
final class C0269v implements InterfaceC0271x {

    /* renamed from: a */
    private final InterfaceC0271x f495a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0269v(InterfaceC0271x interfaceC0271x) {
        this.f495a = interfaceC0271x;
    }

    @Override // com.github.catvod.spider.merge.p021W.InterfaceC0271x
    /* renamed from: a */
    public final void mo1076a(Appendable appendable, int i) {
        this.f495a.mo1076a(appendable, i);
    }

    @Override // com.github.catvod.spider.merge.p021W.InterfaceC0273z
    /* renamed from: b */
    public final void mo1075b(Appendable appendable, Calendar calendar) {
        int i = calendar.get(7);
        this.f495a.mo1076a(appendable, i != 1 ? i - 1 : 7);
    }

    @Override // com.github.catvod.spider.merge.p021W.InterfaceC0273z
    /* renamed from: c */
    public final int mo1074c() {
        return this.f495a.mo1074c();
    }
}
