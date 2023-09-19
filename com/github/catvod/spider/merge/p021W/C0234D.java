package com.github.catvod.spider.merge.p021W;

import com.github.catvod.spider.merge.p018S.C0202c;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.W.D */
/* loaded from: classes.dex */
public final class C0234D implements InterfaceC0273z {

    /* renamed from: a */
    private final Locale f417a;

    /* renamed from: b */
    private final int f418b;

    /* renamed from: c */
    private final String f419c;

    /* renamed from: d */
    private final String f420d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0234D(TimeZone timeZone, Locale locale, int i) {
        this.f417a = C0202c.m1177a(locale);
        this.f418b = i;
        this.f419c = C0244N.m1101h(timeZone, false, i, locale);
        this.f420d = C0244N.m1101h(timeZone, true, i, locale);
    }

    @Override // com.github.catvod.spider.merge.p021W.InterfaceC0273z
    /* renamed from: b */
    public final void mo1075b(Appendable appendable, Calendar calendar) {
        ((StringBuilder) appendable).append((CharSequence) C0244N.m1101h(calendar.getTimeZone(), calendar.get(16) != 0, this.f418b, this.f417a));
    }

    @Override // com.github.catvod.spider.merge.p021W.InterfaceC0273z
    /* renamed from: c */
    public final int mo1074c() {
        return Math.max(this.f419c.length(), this.f420d.length());
    }
}
