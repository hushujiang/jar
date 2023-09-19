package com.github.catvod.spider.merge.p029c0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p025a0.C0293m;
import java.util.regex.Pattern;

/* renamed from: com.github.catvod.spider.merge.c0.M */
/* loaded from: classes.dex */
public final class C0439M extends AbstractC0440N {

    /* renamed from: a */
    private final Pattern f859a;

    public C0439M(Pattern pattern) {
        this.f859a = pattern;
    }

    @Override // com.github.catvod.spider.merge.p029c0.AbstractC0440N
    /* renamed from: a */
    public final boolean mo599a(C0293m c0293m, C0293m c0293m2) {
        return this.f859a.matcher(c0293m2.m960w0()).find();
    }

    public final String toString() {
        return String.format(atm.m897d("50171B012F300F0952503F71"), this.f859a);
    }
}
