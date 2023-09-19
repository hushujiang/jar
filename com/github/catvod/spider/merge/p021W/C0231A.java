package com.github.catvod.spider.merge.p021W;

import java.util.Calendar;

/* renamed from: com.github.catvod.spider.merge.W.A */
/* loaded from: classes.dex */
final class C0231A implements InterfaceC0273z {

    /* renamed from: a */
    private final String f411a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0231A(String str) {
        this.f411a = str;
    }

    @Override // com.github.catvod.spider.merge.p021W.InterfaceC0273z
    /* renamed from: b */
    public final void mo1075b(Appendable appendable, Calendar calendar) {
        ((StringBuilder) appendable).append((CharSequence) this.f411a);
    }

    @Override // com.github.catvod.spider.merge.p021W.InterfaceC0273z
    /* renamed from: c */
    public final int mo1074c() {
        return this.f411a.length();
    }
}
