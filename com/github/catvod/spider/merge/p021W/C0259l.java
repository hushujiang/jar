package com.github.catvod.spider.merge.p021W;

import com.github.catvod.spider.merge.atm;
import java.util.Calendar;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.W.l */
/* loaded from: classes.dex */
public final class C0259l extends AbstractC0261n {

    /* renamed from: b */
    private static final C0259l f455b = new C0259l(atm.m897d("4220065D736231515728103C1148075C65"));

    /* renamed from: c */
    private static final C0259l f456c = new C0259l(atm.m897d("4220065D736231515728103C1148072928235807535C"));

    /* renamed from: d */
    private static final C0259l f457d = new C0259l(atm.m897d("4220065D736231515728103C1148075D736250532611376A175353"));

    C0259l(String str) {
        this.f459a = Pattern.compile(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static /* synthetic */ AbstractC0262o m1093d() {
        return f457d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static AbstractC0262o m1092e(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return f457d;
                }
                throw new IllegalArgumentException(atm.m897d("03140C1420310E5A1400213A0F085A1A2A7832"));
            }
            return f456c;
        }
        return f455b;
    }

    @Override // com.github.catvod.spider.merge.p021W.AbstractC0261n
    /* renamed from: c */
    final void mo1087c(Calendar calendar, String str) {
        calendar.setTimeZone(C0245O.m1099a(str));
    }
}
