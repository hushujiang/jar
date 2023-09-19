package com.github.catvod.spider.merge.p029c0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p025a0.C0293m;
import java.util.regex.Pattern;

/* renamed from: com.github.catvod.spider.merge.c0.o */
/* loaded from: classes.dex */
public final class C0467o extends AbstractC0440N {

    /* renamed from: a */
    String f883a;

    /* renamed from: b */
    Pattern f884b;

    public C0467o(String str, Pattern pattern) {
        this.f883a = C0441O.m623b(str);
        this.f884b = pattern;
    }

    @Override // com.github.catvod.spider.merge.p029c0.AbstractC0440N
    /* renamed from: a */
    public final boolean mo599a(C0293m c0293m, C0293m c0293m2) {
        return c0293m2.m917o(this.f883a) && this.f884b.matcher(c0293m2.mo925d(this.f883a)).find();
    }

    public final String toString() {
        return String.format(atm.m897d("315F090B717D1927"), this.f883a, this.f884b.toString());
    }
}
