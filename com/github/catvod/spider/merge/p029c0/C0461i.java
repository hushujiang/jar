package com.github.catvod.spider.merge.p029c0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p025a0.C0293m;
import java.util.regex.Pattern;

/* renamed from: com.github.catvod.spider.merge.c0.i */
/* loaded from: classes.dex */
public final class C0461i extends AbstractC0440N {

    /* renamed from: a */
    public final /* synthetic */ int f877a;

    /* renamed from: b */
    private final Object f878b;

    public /* synthetic */ C0461i(Object obj, int i) {
        this.f877a = i;
        this.f878b = obj;
    }

    @Override // com.github.catvod.spider.merge.p029c0.AbstractC0440N
    /* renamed from: a */
    public final boolean mo599a(C0293m c0293m, C0293m c0293m2) {
        switch (this.f877a) {
            case 0:
                return c0293m2.m917o((String) this.f878b);
            case 1:
                return c0293m2.m981b0((String) this.f878b);
            default:
                return ((Pattern) this.f878b).matcher(c0293m2.m972k0()).find();
        }
    }

    public final String toString() {
        switch (this.f877a) {
            case 0:
                return String.format(atm.m897d("315F0928"), (String) this.f878b);
            case 1:
                return String.format(atm.m897d("445F09"), (String) this.f878b);
            default:
                return String.format(atm.m897d("50171B012F300F09350222704F0953"), (Pattern) this.f878b);
        }
    }
}
