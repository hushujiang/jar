package com.github.catvod.spider.merge.p016Q;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.github.catvod.spider.merge.Q.b */
/* loaded from: classes.dex */
public final class C0180b implements Iterator<Object> {

    /* renamed from: a */
    final Object[] f323a;

    /* renamed from: b */
    int f324b = 0;

    /* renamed from: c */
    boolean f325c = true;

    /* renamed from: d */
    final /* synthetic */ C0181c f326d;

    public C0180b(C0181c c0181c, Object[] objArr) {
        this.f326d = c0181c;
        this.f323a = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f324b < this.f323a.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f325c = false;
            Object[] objArr = this.f323a;
            int i = this.f324b;
            this.f324b = i + 1;
            return objArr[i];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f325c) {
            throw new IllegalStateException();
        }
        this.f326d.remove(this.f323a[this.f324b - 1]);
        this.f325c = true;
    }
}
