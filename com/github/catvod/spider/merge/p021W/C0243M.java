package com.github.catvod.spider.merge.p021W;

import java.util.Calendar;

/* renamed from: com.github.catvod.spider.merge.W.M */
/* loaded from: classes.dex */
final class C0243M implements InterfaceC0271x {

    /* renamed from: a */
    private final InterfaceC0271x f431a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0243M(InterfaceC0271x interfaceC0271x) {
        this.f431a = interfaceC0271x;
    }

    @Override // com.github.catvod.spider.merge.p021W.InterfaceC0271x
    /* renamed from: a */
    public final void mo1076a(Appendable appendable, int i) {
        this.f431a.mo1076a(appendable, i);
    }

    @Override // com.github.catvod.spider.merge.p021W.InterfaceC0273z
    /* renamed from: b */
    public final void mo1075b(Appendable appendable, Calendar calendar) {
        this.f431a.mo1076a(appendable, calendar.getWeekYear());
    }

    @Override // com.github.catvod.spider.merge.p021W.InterfaceC0273z
    /* renamed from: c */
    public final int mo1074c() {
        return this.f431a.mo1074c();
    }
}
