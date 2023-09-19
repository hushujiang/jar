package com.github.catvod.spider.merge.p021W;

import java.util.Calendar;

/* renamed from: com.github.catvod.spider.merge.W.F */
/* loaded from: classes.dex */
final class C0236F implements InterfaceC0271x {

    /* renamed from: a */
    private final InterfaceC0271x f424a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0236F(InterfaceC0271x interfaceC0271x) {
        this.f424a = interfaceC0271x;
    }

    @Override // com.github.catvod.spider.merge.p021W.InterfaceC0271x
    /* renamed from: a */
    public final void mo1076a(Appendable appendable, int i) {
        this.f424a.mo1076a(appendable, i);
    }

    @Override // com.github.catvod.spider.merge.p021W.InterfaceC0273z
    /* renamed from: b */
    public final void mo1075b(Appendable appendable, Calendar calendar) {
        int i = calendar.get(10);
        if (i == 0) {
            i = calendar.getLeastMaximum(10) + 1;
        }
        this.f424a.mo1076a(appendable, i);
    }

    @Override // com.github.catvod.spider.merge.p021W.InterfaceC0273z
    /* renamed from: c */
    public final int mo1074c() {
        return this.f424a.mo1074c();
    }
}
