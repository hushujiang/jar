package com.github.catvod.spider.merge.p057s;

import com.github.catvod.spider.merge.p056r.C0665m;
import java.util.NoSuchElementException;

/* renamed from: com.github.catvod.spider.merge.s.d */
/* loaded from: classes.dex */
final class C0677d<E> extends AbstractC0687n<Object> {

    /* renamed from: a */
    private final int f1278a;

    /* renamed from: b */
    private int f1279b;

    /* renamed from: c */
    private final AbstractC0679f<E> f1280c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0677d(AbstractC0679f<E> abstractC0679f, int i) {
        int size = abstractC0679f.size();
        C0665m.m126f(i, size);
        this.f1278a = size;
        this.f1279b = i;
        this.f1280c = abstractC0679f;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f1279b < this.f1278a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f1279b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f1279b;
            this.f1279b = i + 1;
            return this.f1280c.get(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f1279b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f1279b - 1;
            this.f1279b = i;
            return this.f1280c.get(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f1279b - 1;
    }
}
