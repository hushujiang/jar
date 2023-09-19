package com.github.catvod.spider.merge.p029c0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p024Z.C0280b;
import com.github.catvod.spider.merge.p025a0.C0290j;
import com.github.catvod.spider.merge.p025a0.C0293m;
import java.io.Serializable;
import java.util.regex.Pattern;

/* renamed from: com.github.catvod.spider.merge.c0.r */
/* loaded from: classes.dex */
public final class C0470r extends AbstractC0440N {

    /* renamed from: a */
    public final /* synthetic */ int f885a = 0;

    /* renamed from: b */
    private final Serializable f886b;

    public C0470r(String str) {
        StringBuilder m1058b = C0280b.m1058b();
        C0280b.m1059a(m1058b, str, false);
        this.f886b = C0441O.m624a(C0280b.m1052h(m1058b));
    }

    @Override // com.github.catvod.spider.merge.p029c0.AbstractC0440N
    /* renamed from: a */
    public final boolean mo599a(C0293m c0293m, C0293m c0293m2) {
        switch (this.f885a) {
            case 0:
                return C0441O.m624a(c0293m2.m972k0()).contains((String) this.f886b);
            default:
                StringBuilder m1058b = C0280b.m1058b();
                C0441O.m622c(new C0290j(m1058b), c0293m2);
                return ((Pattern) this.f886b).matcher(C0280b.m1052h(m1058b)).find();
        }
    }

    public final String toString() {
        switch (this.f885a) {
            case 0:
                return String.format(atm.m897d("5019151B38390314093A3B36425F095C"), (String) this.f886b);
            default:
                return String.format(atm.m897d("50171B012F300F092D1D23340F2E1F0D38704F0953"), (Pattern) this.f886b);
        }
    }

    public C0470r(Pattern pattern) {
        this.f886b = pattern;
    }
}
