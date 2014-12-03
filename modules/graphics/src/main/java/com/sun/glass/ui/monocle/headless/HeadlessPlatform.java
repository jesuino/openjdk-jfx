package com.sun.glass.ui.monocle.headless;/*
 * Copyright (c) 2013, 2014, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

import com.sun.glass.ui.monocle.NativeCursor;
import com.sun.glass.ui.monocle.NativePlatform;
import com.sun.glass.ui.monocle.NativeScreen;
import com.sun.glass.ui.monocle.NullCursor;
import com.sun.glass.ui.monocle.input.InputDeviceRegistry;
import com.sun.glass.ui.monocle.linux.LinuxInputDeviceRegistry;

public class HeadlessPlatform extends NativePlatform {

    @Override
    protected InputDeviceRegistry createInputDeviceRegistry() {
        // use of a LinuxInputDeviceRegistry lets us simulate
        // Linux input devices on any system
        return new LinuxInputDeviceRegistry(true);
    }

    @Override
    protected NativeCursor createCursor() {
        return new NullCursor();
    }

    @Override
    protected NativeScreen createScreen() {
        return new HeadlessScreen();
    }

}