package com.github.catvod.spider.merge.p029c0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p023Y.C0277c;
import com.github.catvod.spider.merge.p025a0.C0281a;
import com.github.catvod.spider.merge.p025a0.C0293m;
import java.io.Serializable;
import java.util.regex.Pattern;

/* renamed from: com.github.catvod.spider.merge.c0.k */
/* loaded from: classes.dex */
public final class C0463k extends AbstractC0440N {

    /* renamed from: a */
    public final /* synthetic */ int f881a;

    /* renamed from: b */
    private final Serializable f882b;

    public C0463k(String str, int i) {
        this.f881a = i;
        if (i == 1) {
            this.f882b = C0441O.m624a(str);
            return;
        }
        C0277c.m1065j(str);
        this.f882b = C0441O.m624a(str);
    }

    @Override // com.github.catvod.spider.merge.p029c0.AbstractC0440N
    /* renamed from: a */
    public final boolean mo599a(C0293m c0293m, C0293m c0293m2) {
        switch (this.f881a) {
            case 0:
                for (C0281a c0281a : c0293m2.mo924e().m1038g()) {
                    if (C0441O.m624a(c0281a.m1048a()).startsWith((String) this.f882b)) {
                        return true;
                    }
                }
                return false;
            case 1:
                return C0441O.m624a(c0293m2.m985X()).contains((String) this.f882b);
            default:
                return ((Pattern) this.f882b).matcher(c0293m2.m958y0()).find();
        }
    }

    public final String toString() {
        switch (this.f881a) {
            case 0:
                return String.format(atm.m897d("31245F0611"), (String) this.f882b);
            case 1:
                return String.format(atm.m897d("5019151B3839031409312D2C0B525F0665"), (String) this.f882b);
            default:
                return String.format(atm.m897d("50171B012F300F092D1D23340F350D1B183D120E52503F71"), (Pattern) this.f882b);
        }
    }

    public C0463k(Pattern pattern) {
        this.f881a = 2;
        this.f882b = pattern;
    }
}
