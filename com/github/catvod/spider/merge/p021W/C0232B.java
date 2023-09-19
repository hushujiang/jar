package com.github.catvod.spider.merge.p021W;

import java.util.Calendar;

/* renamed from: com.github.catvod.spider.merge.W.B */
/* loaded from: classes.dex */
final class C0232B implements InterfaceC0273z {

    /* renamed from: a */
    private final int f412a;

    /* renamed from: b */
    private final String[] f413b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0232B(int i, String[] strArr) {
        this.f412a = i;
        this.f413b = strArr;
    }

    @Override // com.github.catvod.spider.merge.p021W.InterfaceC0273z
    /* renamed from: b */
    public final void mo1075b(Appendable appendable, Calendar calendar) {
        ((StringBuilder) appendable).append((CharSequence) this.f413b[calendar.get(this.f412a)]);
    }

    @Override // com.github.catvod.spider.merge.p021W.InterfaceC0273z
    /* renamed from: c */
    public final int mo1074c() {
        int length = this.f413b.length;
        int i = 0;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            int length2 = this.f413b[length].length();
            if (length2 > i) {
                i = length2;
            }
        }
    }
}
