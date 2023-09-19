package com.github.catvod.spider.merge.p056r;

import java.util.Iterator;

/* renamed from: com.github.catvod.spider.merge.r.p */
/* loaded from: classes.dex */
final class C0668p implements Iterable<String> {

    /* renamed from: a */
    final /* synthetic */ CharSequence f1262a;

    /* renamed from: b */
    final /* synthetic */ C0670r f1263b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0668p(C0670r c0670r, CharSequence charSequence) {
        this.f1263b = c0670r;
        this.f1262a = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return C0670r.m122a(this.f1263b, this.f1262a);
    }

    public final String toString() {
        C0660h m134b = C0660h.m134b();
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        StringBuilder m135a = m134b.m135a(sb, this);
        m135a.append(']');
        return m135a.toString();
    }
}
