# Our First Duplicate Finder (OFIDUF)

Finds duplicate files in different directories.

- Inspired by [FastDuplicateFinder](https://github.com/carlbeech/fast-duplicate-finder)
- (Currently) more code-oriented
- Less UI than [dupeGuru](https://dupeguru.voltaicideas.net/)

This is the successor of ["Koppor's Duplicate Finder" (KODF)](https://github.com/koppor/kodf).
The main differences are:

- Browser-based UI (instead of Command Line Tool)
- Stores file information in a database
- Based on Spring Boot

## Distinguishing features

- **Diretory subset identification**.
  Sometimes, a file-based backup is made to different places on the NAS.
  As user, I want to know if a directory can be completely erased.
- **Arbitrary duplicate identification**.
  Finds duplicate directories in aribtrary sub folders.
  For instance, if one copy of the directory is contained in both `H:\backups\2019-01-05\data-from-white-hdd` and in `H:\0-to-sort\whiteone`, it is found
  With other tools, one has to start the comparison from `H:\backups\2019-01-05` and `H:\0-to-sort`, but who knows that `2019-01-05` is the right top level diretory to start from.
