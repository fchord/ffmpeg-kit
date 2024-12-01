#!/bin/bash

# ALWAYS CLEAN THE PREVIOUS BUILD
make distclean 2>/dev/null 1>/dev/null

# REGENERATE BUILD FILES IF NECESSARY OR REQUESTED
if [[ ! -f "${BASEDIR}"/src/"${LIB_NAME}"/configure ]] || [[ ${RECONF_sdl} -eq 1 ]]; then
  autoreconf_library "${LIB_NAME}" 1>>"${BASEDIR}"/build.log 2>&1 || return 1
fi
LD=ld
LDFLAGS="-Wl,-soname,libSDL2.so"
LT_LDFLAGS="-Wl,-soname,libSDL2.so"
./configure \
  --prefix="${LIB_INSTALL_PREFIX}" \
  --with-pic \
  --without-x \
  --with-sysroot="${ANDROID_SYSROOT}" \
  --enable-static \
  --enable-shared \
  --disable-fast-install \
  --host="${HOST}" || return 1

# mv Makefile Makefile_bak
# cp Makefile_m Makefile
cp libtool_m libtool

make -j$(get_cpu_count) || return 1

make install || return 1

# MANUALLY COPY PKG-CONFIG FILES
cp ./*.pc "${INSTALL_PKG_CONFIG_DIR}" || return 1
