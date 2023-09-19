package com.github.catvod.spider.merge.p021W;

import com.github.catvod.spider.merge.atm;
import java.util.Calendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.W.w */
/* loaded from: classes.dex */
public final class C0270w implements InterfaceC0273z {

    /* renamed from: b */
    static final C0270w f496b = new C0270w(3);

    /* renamed from: c */
    static final C0270w f497c = new C0270w(5);

    /* renamed from: d */
    static final C0270w f498d = new C0270w(6);

    /* renamed from: a */
    final int f499a;

    C0270w(int i) {
        this.f499a = i;
    }

    @Override // com.github.catvod.spider.merge.p021W.InterfaceC0273z
    /* renamed from: b */
    public final void mo1075b(Appendable appendable, Calendar calendar) {
        int i = calendar.get(16) + calendar.get(15);
        if (i == 0) {
            ((StringBuilder) appendable).append((CharSequence) atm.m897d("30"));
            return;
        }
        if (i < 0) {
            ((StringBuilder) appendable).append('-');
            i = -i;
        } else {
            ((StringBuilder) appendable).append('+');
        }
        int i2 = i / 3600000;
        C0244N.m1108a(appendable, i2);
        int i3 = this.f499a;
        if (i3 < 5) {
            return;
        }
        if (i3 == 6) {
            ((StringBuilder) appendable).append(':');
        }
        C0244N.m1108a(appendable, (i / 60000) - (i2 * 60));
    }

    @Override // com.github.catvod.spider.merge.p021W.InterfaceC0273z
    /* renamed from: c */
    public final int mo1074c() {
        return this.f499a;
    }
}
