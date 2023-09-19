package com.github.catvod.spider.merge.p029c0;

import com.github.catvod.spider.merge.p024Z.C0280b;
import com.github.catvod.spider.merge.p025a0.C0293m;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: com.github.catvod.spider.merge.c0.d */
/* loaded from: classes.dex */
public final class C0456d extends AbstractC0458f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0456d(Collection<AbstractC0440N> collection) {
        this.f875a.addAll(collection);
        m607b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0456d(AbstractC0440N... abstractC0440NArr) {
        this(Arrays.asList(abstractC0440NArr));
    }

    @Override // com.github.catvod.spider.merge.p029c0.AbstractC0440N
    /* renamed from: a */
    public final boolean mo599a(C0293m c0293m, C0293m c0293m2) {
        for (int i = this.f876b - 1; i >= 0; i--) {
            if (!this.f875a.get(i).mo599a(c0293m, c0293m2)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return C0280b.m1054f(this.f875a, "");
    }
}
