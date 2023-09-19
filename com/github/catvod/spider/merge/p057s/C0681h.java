package com.github.catvod.spider.merge.p057s;

import java.util.NoSuchElementException;

/* renamed from: com.github.catvod.spider.merge.s.h */
/* loaded from: classes.dex */
final class C0681h extends AbstractC0686m<Object> {

    /* renamed from: a */
    boolean f1287a;

    /* renamed from: b */
    final /* synthetic */ Object f1288b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0681h(Object obj) {
        this.f1288b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f1287a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f1287a) {
            throw new NoSuchElementException();
        }
        this.f1287a = true;
        return this.f1288b;
    }
}
